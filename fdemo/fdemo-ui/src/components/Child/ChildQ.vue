<template>
	<div style="height: 400px;">
		<div v-for="(xinwenshuju,index) in xinwenshuju" :key="index" v-if="index<list">
			<div label="rtl" @click="toDetail(xinwenshuju.id)" type="primary" class="mian-content">
				<div class="imgs">
					<img @click="toDetail(xinwenshuju.id)" :src="dizhi + xinwenshuju.cover" alt="图片加载失败">
				</div>
				<div style="margin: 0 0 0 20px;font-family:微软雅黑;">
					<p style="font-weight: bold">标题：{{ xinwenshuju.title }}</p>
					<div style="height: 76px;overflow: hidden">
						<span v-html="xinwenshuju.content">{{xinwenshuju.content}}</span>
					</div>
					<div style="display: flex;padding: 10px">
						<p style="margin-right: 10px">日期：{{ xinwenshuju.publishDate }}</p>
						<p>点赞数：{{xinwenshuju.likeNum}}</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>
<script>
	export default {
		name: "ChildQ",
		data() {
			return {
				dizhi: 'http://124.93.196.45:10001',
				list: 28,
				xinwenshuju: []
			}
		},
		created() {
			this.$axios({
					url: 'http://124.93.196.45:10001/prod-api/api/metro/press/press/list',
					method: 'get',
					data: {},
				})
				.then((res) => {
					// console.log(res.data.rows);
					this.xinwenshuju = res.data.rows.slice(0, 30);
					// console.log(this.xinwenshuju.content)
				})
				.catch((err) => {
					console.log(err)
				})
		},
		methods: {
			toDetail(id) {
				this.$router.push({
					'name': 'diler',
					params: {
						id: id
					}
				})

			}
		}
	}
</script>

<style scoped>
	.mian-content {
		height: 200px;
		display: flex;
		margin: 15px 0;
		background: #ffffff;
	}

	.mian-content:hover {
		background: #f8f8f8;
	}

	.imgs {
		width: 280px;
		height: 200px;
	}

	.mian-content img {
		width: 260px;
		height: 180px;
		margin: 10px;
		border-radius: 20px;
	}
</style>