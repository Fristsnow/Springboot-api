<template>
  <div>
      <div :id="id" v-if="content">
        <div>
          <img :src="dizhi+cover"/>
          <p v-html="content">{{ content}}</p>
        </div>
      </div>
  </div>
</template>

<script>
export default {
  name: "diler",
  data() {
    return {
      dizhi: 'http://124.93.196.45:10001',  //服务器地址
      id: this.$route.params.id,  //路由传参后的id
      content: [],//评论
      cover:[]  //图片
    }
  },
  created() {
    this.$axios({
      url: 'http://124.93.196.45:10001/prod-api/press/press/' + this.id,
      method: 'get',
      data: {}
    }).then((res) => {
      this.content = res.data.data.content
      this.cover = res.data.data.cover
      // console.log(this.content)
    }).catch((err) => {
      console.log(err)
    })
  },
  methods: {}
}
</script>

<style scoped>
*{
  margin: 0;
  padding: 0;
}
</style>