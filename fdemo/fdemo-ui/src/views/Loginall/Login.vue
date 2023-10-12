<template xmlns="http://www.w3.org/1999/html">
	<div class="main">
		<div>
			<img style="width: 900px;height: 600px;object-fit: cover;" :src="src" alt="图片加载失败" />
		</div>
		<div class="login-main">
			<p>{{apis}}</p>
			<p style="text-align: center">智慧城市后台数据管理登录</p>
			<div class="login-main-inp">
				<!--                <span>账户：</span>-->
				<input v-model="username" placeholder="请输入你的账户：" type="text" /><br>
				<!--                <span>密码：</span>-->
				<input v-model="password" placeholder="请输入你的密码" type="password"><br>
			</div>
			<!--            <input @click="Login" class="sub" type="submit" placeholder="登录"><br>-->
			<input class="sub" @click="Login" type="button" value="登录"></input>
			<input style="background: #ffffff;margin-top: 10px" class="sub" type="button" @click="zhuce" value="注册" />
<!--					<div v-for="(apis,index) in apis" :key="index">-->
<!--						<p>{{apis.content}}</p>-->
<!--					</div>-->
			<!--            <div style="width:300px;margin:0 auto;display: flex;justify-content: space-between">-->
			<!--                <span @click="zhuce">注册</span>-->
			<!--&lt;!&ndash;                <span @click="wangji">修改密码</span>&ndash;&gt;-->
			<!--            </div>-->
		</div>
	</div>
</template>

<script>
	import Apis from '@/components/Apis'
	export default {
		name: "Login",
		comments:{
			Apis
		},
		data() {
			return {
				username: '',
				password: '',
				src: require('/public/loginbanner.png'),
				keys:'4c4a0a60f121ef5b30e5ecd43d4ae3dc',
				apis:''
			}
		},
		created() {
			this.$axios({
				url:'http://apis.tianapi.com/zaoan/index?+key='+ this.keys,
				method:'post'
			}).then((res)=>{
				this.apis = res.data.result.content
				console.log(res.data.result)
			}).catch((err)=>{
				console.log(err)
			})
		},
		mounted() {

		},
		methods: {
			Login: function(e) {
				this.$axios({
					url: 'http://124.93.196.45:10001/prod-api/api/login',
					// url: 'http://localhost:8090/list',
					method: "post",
					// headers: {'X-Requested-With': 'XMLHttpRequest'},
					data: {
						username: this.username,
						password: this.password,
					},
				}).then((res) => {
					console.log("ok")
					if (res.data.code == '200') {
						// console.log("ok");
						// console.log(res.data);
						this.$router.push('/navitem')
						// this.router.push(
						//     {
						//         'name':'home',
						//         params:this.username
						//     }
						// )
						console.log(this.username)
					} else {
						alert("登录失败,请输入正确的账号或者密码！")
					}
				}).catch((err) => {
					console.log(err);
				})
			},
			zhuce: function(e) {
				console.log("ok")
				this.$router.push('/Loginall/Zhuce')
			},
			wangji: function(e) {
				console.log("ok")
				this.$router.push({
					'name': 'Wpassword',
					params: this.username
				})
			}
		}
	}
</script>
<!--函数名:function (e) {-->
<!--this.$axios({-->
<!--url: '接口地址',-->
<!--method: "post", //请求方式-->
<!--data: {}-->
<!--}).then((res) => { //请求成功后执行then内部方法-->
<!--console.log("ok")-->
<!--}).catch((err) => { //请求失败后执行catch内部方法-->
<!--console.log(err);-->
<!--})-->
<!--},-->
<style scoped>
	* {
		margin: 0;
		padding: 0;
	}

	.main {
		width: 100%;
		display: flex;
	}

	.login-main {
		width: 400px;
		float: right;
		height: 600px;
		text-align: center;
		background: #cccccc;
	}

	.login-main p {
		margin-top: 90px;
		margin-bottom: 30px;
	}

	.login-main-inp {
		/*margin-top: 30px;*/
	}

	.login-main .login-main-inp input {
		width: 300px;
		height: 30px;
		margin: 10px 0;
		border-radius: 20px;
		border: 2px solid #0cdefa;
	}

	.sub {
		width: 300px;
		height: 32px;
		margin: 30px 30px 0 30px;
		background: red;
		border-radius: 20px;
		border: 2px solid #0cdefa;
	}
</style>