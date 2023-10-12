<template>
    <!--        导航-->
    <div style="width: 100%;">
<!--        :default-active="xuanzhong"-->
        <el-menu style="display: flex;justify-content: space-between;"
                 router
                 mode="horizontal">
            <el-menu-item index="/">首页新闻</el-menu-item>
            <el-menu-item index="/Zhiyuan">志愿服务</el-menu-item>
            <el-menu-item index="/Shuzi">数字图书馆</el-menu-item>
            <el-menu-item index="/Zhengfu">政府服务热线</el-menu-item>
            <el-menu-item index="/Lajifenlei">垃圾分类</el-menu-item>
<!--            <el-menu-item index="Bianming">便民服务</el-menu-item>-->
<!--            <el-menu-item index="Life">生活服务</el-menu-item>-->
<!--            <el-menu-item index="Car">车主服务</el-menu-item>-->
        </el-menu>
    </div>
</template>

<script>

    import ChildQ from "@/components/Child/ChildQ";
    import ChildW from "@/components/Child/ChildW";
    import ChildE from "@/components/Child/ChildE";
    import ChildR from "@/components/Child/ChildR";
    import ChildT from "@/components/Child/ChildT";
    import ChildY from "@/components/Child/ChildY";

    export default {
        name: "xinwen",
        components: {ChildQ, ChildW, ChildE, ChildR, ChildT, ChildY},
        data() {
            return {
                name: '',
                courses: [],
                rou1: [],
                activeName: '1',
            }
        },
        created() {
            // this.$axios({
            //   url: 'http://124.93.196.45:10001/prod-api/press/category/list',
            //   method: "get",
            //   data: {},
            // }).then(res => {
            //   this.courses = res.data.data;
            //   console.log(res.data.data)
            // }).catch(err => {
            //   console.log(err);
            // })
        },
        methods: {
            handleClick(tab, event) {
                console.log(tab, event);
            },
            // rou: function (e) {
            //   if (this.courses.id === '9'){
            //     this.$router.push('/Child/ChildQ')
            //   }else if (this.courses.id === '17'){
            //     // 19,20,21,22
            //     this.$router.push('/Child/ChildW')
            //   }else if (this.courses.id === '19'){
            //     this.$router.push('/Child/ChildE')
            //   }else if (this.courses.id === '20'){
            //     this.$router.push('/Child/ChildR')
            //   }else if (this.courses.id === '21'){
            //     this.$router.push('/Child/ChildT')
            //   }else{
            //     this.$router.push('/Child/ChildY')
            //   }
            // switch (this.courses.id){
            //   case this.courses.id == '9':
            //     this.$router.push('/Child/ChildQ')
            //         break;
            //   case this.courses.id == '17':
            //     this.$router.push('/Child/ChildW')
            //     break;
            //   case this.courses.id == '19':
            //     this.$router.push('/Child/ChildE')
            //     break;
            //   case this.courses.id == '20':
            //     this.$router.push('/Child/ChildR')
            //     break;
            //   case this.courses.id == '21':
            //     this.$router.push('/Child/ChildT')
            //     break;
            //   case this.courses.id == '22':
            //     this.$router.push('/Child/ChildY')
            //     break;
            // }
        }
    }
    // computed: {
    //   filterTitles() {
    //     return this.courses.filter(course => {
    //       return course.name.match(this.Xinwen);
    //     })
    //   }
    // },
</script>

<style scoped>
    .main-nav {
        width: 100%;

    }

</style>