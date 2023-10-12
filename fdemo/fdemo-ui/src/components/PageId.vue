<script>
import {api} from "@/api/api";

export default {
  data() {
    return {
      dataPage: [],
      total: 100,
      paramsId: {
        page: 1,
        pageSize: 5
      },
      currentPage: 1,
      form: [],
      dialogVisible: false,
      dialogFormVisibleUpdate: false,
      dialogFormVisibleCreate: false,
      formLabelWidth: '120px',
      search: {
        name: '',
        email: '',
        begin: '',
        end: ''
      },
      createData: {
        name: '',
        email: '',
        password: '',
        birthday: ''
      }
    }
  },
  methods: {
    handleSizeChange(val) {
      this.paramsId.pageSize = val
      this.tableApi()
    },
    handleCurrentChange(val) {
      this.paramsId.page = val
      this.tableApi()
    },
    handleEdit(index, row) {
      // console.log(index, row);
      this.dialogFormVisibleUpdate = true
      api.get(`user/${row.id}`, {
        headers: {Token: sessionStorage.getItem('token')}
      })
          .then((res) => {
            this.form = res.data.data
          })
    },
    handleDelete(index, row) {
      // console.log(index + 1, row.id);
      this.$confirm('此操作将永久删除该文件, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        api.delete(`user/${row.id}`, {
          headers: {Token: sessionStorage.getItem('token')}
        })
            .then((res) => {
              this.tableApi()
              this.$message({
                type: res.data.msg,
                message: '删除成功!'
              });
            })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });
    },
    tableApi() {
      api.get(`user/page?page=${this.paramsId.page}&pageSize=${this.paramsId.pageSize}&name=${this.search.name}&email=${this.search.email}&begin=${this.search.begin}&end=${this.search.end}`, {
        headers: {'Token': sessionStorage.getItem('token')}
      })
          .then((res) => {
            // console.log(res.data.data.rows)
            this.dataPage = res.data.data.rows
            this.total = res.data.data.total
            this.currentPage = this.paramsId.page
          })
          .catch((err) => {
            console.log(err.response)
            // alert(err.response.msg)
          })
    },
    messageOpen() {
      this.$message('已取消!');
      this.dialogVisible = false
    },
    successOpen() {
      this.dialogFormVisibleUpdate = false
      api.put(`user/update/`, this.form, {
        headers: {Token: sessionStorage.getItem('token')}
      })
          .then((res) => {
            this.tableApi()
            this.$message({
              message: res.data.msg,
              type: 'success'
            });
          })
    },
    createApi() {
      this.dialogFormVisibleCreate = true
    },
    CreateSuccessOpen() {
      api.post(`user`, this.createData, {
        headers: {Token: sessionStorage.getItem('token')}
      })
          .then((res) => {
            this.tableApi()
            this.dialogFormVisibleCreate = false
            this.$message({
              message: res.data.msg,
              type: 'success'
            });
          })
    }
  },
  watch: {
    search: {
      handler(val) {
        if (!val.value) this.tableApi()
      },
      deep: true
    }
  },
  created() {
    api.post(`login`, {email: 'tom@123.com', password: '123456'})
        .then((res) => {
          // console.log(res.data.data)
          sessionStorage.setItem('token', res.data.data)
          // console.log(this.token)
        })
    this.tableApi()
    // this.$axios.interceptors.request.use((i)=>{
    //   i.headers.Authorization = 'eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiVG9tMSIsImlkIjo5LCJlbWFpbCI6InRvbUAxMjMuY29tIiwiZXhwIjoxNjk2OTY3MTE0fQ.ZT9UdeQtlLB4gHiZ1b4-RJuMuhzLUehnxJm4ZfNURu0'
    //   return i
    // })
    // window.sessionStorage.setItem("token","eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiVG9tMSIsImlkIjo5LCJlbWFpbCI6InRvbUAxMjMuY29tIiwiZXhwIjoxNjk2OTY3MTE0fQ.ZT9UdeQtlLB4gHiZ1b4-RJuMuhzLUehnxJm4ZfNURu0")
    // this.$axios.header.get['Token'] = 'eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiVG9tMSIsImlkIjo5LCJlbWFpbCI6InRvbUAxMjMuY29tIiwiZXhwIjoxNjk2OTY3MTE0fQ.ZT9UdeQtlLB4gHiZ1b4-RJuMuhzLUehnxJm4ZfNURu0'
    // this.$axios.get("http://localhost:9091/user/page", {
    //   // headers: {'Authorization': 'Bearer' + 'eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiVG9tMSIsImlkIjo5LCJlbWFpbCI6InRvbUAxMjMuY29tIiwiZXhwIjoxNjk2OTY3MTE0fQ.ZT9UdeQtlLB4gHiZ1b4-RJuMuhzLUehnxJm4ZfNURu0'},
    //   headers: {Token: 'eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiVG9tMSIsImlkIjo5LCJlbWFpbCI6InRvbUAxMjMuY29tIiwiZXhwIjoxNjk2OTY3MTE0fQ.ZT9UdeQtlLB4gHiZ1b4-RJuMuhzLUehnxJm4ZfNURu0'},
    // }
    //     .then((res) => {
    //       console.log(res)
    //     })
    //     .catch((err) => {
    //       console.log(err.response)
    //     })

  }
}
</script>

<template>
  <div>
    <!--    搜索-->
    <div>
      <el-input v-model="search.name" clearable placeholder="请输入名字"></el-input>
      <el-input v-model="search.email" clearable placeholder="请输入电子邮箱"></el-input>
      <el-date-picker
          v-model="search.begin"
          type="date"
          placeholder="选择日期">
      </el-date-picker>
      <el-date-picker
          v-model="search.end"
          type="date"
          placeholder="选择日期">
      </el-date-picker>
      <el-button type="primary" @click="tableApi()" plain>搜索</el-button>
      <el-button type="primary" @click="createApi()" plain>新增</el-button>
    </div>
    <!--    表格-->
    <template>
      <el-table
          :data="dataPage"
          style="width: 100%">
        <el-table-column
            label="日期"
            width="180"
            prop="id">
        </el-table-column>
        <el-table-column
            label="姓名"
            width="180"
            prop="name">
        </el-table-column>
        <el-table-column
            label="密码"
            width="180"
            prop="password">
        </el-table-column>
        <el-table-column
            label="email"
            width="180"
            prop="email">
        </el-table-column>
        <el-table-column
            label="生日"
            width="180"
            prop="birthday">
        </el-table-column>
        <el-table-column label="操作">
          <template slot-scope="scope">
            <el-button
                size="mini"
                @click="handleEdit(scope.$index, scope.row)">编辑
            </el-button>
            <el-button
                size="mini"
                type="danger"
                @click="handleDelete(scope.$index, scope.row)">删除
            </el-button>
          </template>
        </el-table-column>
      </el-table>
    </template>
    <!--    分页-->
    <div class="block">
      <el-pagination
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="currentPage"
          :page-sizes="[5, 10, 15, 20]"
          :page-size="5"
          layout="total, sizes, prev, pager, next, jumper"
          :total="total">
      </el-pagination>
    </div>
    <!-- 修改用户-->
    <el-dialog title="修改用户" :visible.sync="dialogFormVisibleUpdate">
      <el-form :model="form">
        <el-form-item label="名字" :label-width="formLabelWidth">
          <el-input v-model="form.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="密码" :label-width="formLabelWidth">
          <el-input v-model="form.password" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="电子邮件" :label-width="formLabelWidth">
          <el-input v-model="form.email" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="生日" :label-width="formLabelWidth">
          <el-date-picker
              v-model="form.birthday"
              type="date"
              placeholder="选择日期">
          </el-date-picker>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="messageOpen">取 消</el-button>
        <el-button type="primary" @click="successOpen">确 定</el-button>
      </div>
    </el-dialog>
    <!-- 新增用户-->
    <el-dialog title="新增用户" :visible.sync="dialogFormVisibleCreate">
      <el-form :model="createData">
        <el-form-item label="名字" :label-width="formLabelWidth">
          <el-input v-model="createData.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="密码" :label-width="formLabelWidth">
          <el-input v-model="createData.password" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="电子邮件" :label-width="formLabelWidth">
          <el-input v-model="createData.email" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="生日" :label-width="formLabelWidth">
          <el-date-picker
              v-model="createData.birthday"
              type="date"
              placeholder="选择日期">
          </el-date-picker>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="messageOpen">取 消</el-button>
        <el-button type="primary" @click="CreateSuccessOpen">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<style scoped>

</style>