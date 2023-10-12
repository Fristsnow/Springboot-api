<template>
    <div>
        <div class="main-top">
            <Header></Header>
        </div>
        <div class="zhuce-main">
            <div style="text-align: center;display: flex;justify-content: space-between;padding: 15px">
                <span> 智慧城市后台数据管理用户注册</span>
                <router-link to="/Login"><span>已有账号，去登陆</span></router-link>
            </div>
            <div class="zhuce-main-inp">
                <input placeholder="请输入新密码" type="text" v-model="newPassword"/>
                <input placeholder="请输入旧密码" type="text" v-model="oldPassword"/>
                <input @click="dl" class="btn" type="submit" value="点击确定">
            </div>
        </div>
    </div>
</template>

<script>
    import Header from "@/components/headerN.vue";

    export default {
        name: "Wpassword",
        comments: {Header},
        data() {
            return {
                newPassword: '',
                oldPassword: '',
                username:this.$router.params.username
            }
        },
        methods: {
            dl: function (e) {
                this.$axios({
                    url: 'http://124.93.196.45:10001/prod-api/api/common/users/resetPwd',
                    method: 'PUT',
                    data: {
                        newPassword: this.newPassword,
                        oldPassword: this.oldPassword
                    }
                }).then((res) => {
                    if (res.data.code == '200') {
                        alert("恭喜你，当前密码修改成功！")
                        this.$router.push('/navitem')
                        console.log(res.data)
                    } else {
                        console.log('旧密码不能与新密码一致')
                    }
                }).catch((err) => {
                    console.log(err)
                })

            }
        }
    }
</script>

<style scoped>
    * {
        margin: 0;
        padding: 0;
    }

    .main-top {
        margin-bottom: 30px;
    }

    .zhuce-main {
        width: 500px;
        height: 600px;
        margin: 0 auto;
        background: #ffffff;
        text-align: center;
    }

    .zhuce-main-inp input {
        width: 300px;
        height: 27px;
        margin: 20px 0;
        border: 2px solid #ccc;
    }

    .btn {
        width: 300px;
        height: 27px;
        margin-top: 26px;
        background: #cccccc;
    }
</style>