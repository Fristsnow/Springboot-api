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
                <!--            <p>请输入用户名</p>-->
                <input type="text" v-model="userName" placeholder="请输入用户名"/>
                <!--            <p>请输入密码</p>-->
                <input type="text" v-model="password" placeholder="请输入密码"/>
                <!--            <p>请输入电话号</p>-->
                <input type="text" v-model="phonenumber" placeholder="请输入电话号"/>
                <!--            <p>请输入数字：0：男，1：女</p>-->
                <input type="text" v-model="sex" placeholder="请输入数字：0：男，1：女"/>
                <input class="btn" @click="btn" type="submit" value="点击注册"/>
            </div>
        </div>
    </div>
</template>

<script>
    import Header from "@/components/headerN.vue";
    export default {
        name: "Zhuce",
        components: {Header},
        data(){
            return{
                userName:'',
                password:'',
                phonenumber:'',
                sex:''
            }
        },
        methods:{
            btn:function (e) {
                this.$axios({
                    url:'http://124.93.196.45:10001/prod-api/api/register',
                    method:'post',
                    data:{
                        userName:this.userName,
                        password:this.password,
                        phonenumber: this.phonenumber,
                        sex:this.sex,
                    }
                }).then((res)=>{
                    console.log(res)
                    if(res.data.code == '200'){
                        alert("恭喜你注册成功！")
                        console.log(res.data)
                        this.$router.push('/navitem')
                    }else {
                        alert('注册失败，请重新填写！')
                    }
                }).catch((err)=>{
                    console.log(err)
                })

            }
        }
    }
</script>

<style scoped>
    *{
        margin: 0;
        padding: 0;
    }
    .main-top{
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
    .btn{
        width: 300px;
        height: 27px;
        margin-top: 26px;
        background: #cccccc;
    }
</style>