<template>
  <div class="home">
    <!--        <Apis></Apis>-->
    <PageId></PageId>
    <HeaderN></HeaderN>
    <Nav></Nav>
    <div class="loop">
      <el-carousel type="card" :interval="3000" arrow="always">
        <el-carousel-item v-for="(looping,index) in looping" :key="index">
          <img :src="address + looping.advImg" alt=""/>
        </el-carousel-item>
      </el-carousel>
    </div>
    <!--        专题-->
    <div>
    </div>
    <div>
      <ChildQ></ChildQ>
    </div>
  </div>
</template>

<script>
import ChildQ from "@/components/Child/ChildQ";
import HeaderN from "@/components/headerN.vue";
import Nav from '@/components/nav';
import Apis from '@/components/Apis'
import PageId from "@/components/PageId.vue";

export default {
  name: 'HomeIndex',
  components: {
    HeaderN,
    ChildQ,
    Nav,
    Apis,
    PageId
  },
  data() {
    return {
      address: 'http://124.93.196.45:10001', //地址
      looping: [],
    }
  },
  created() {
    this.$axios({
      url: 'http://124.93.196.45:10001/prod-api/api/rotation/list',
      method: 'get',
      data: {}
    }).then((res) => {
      // console.log(res.data.rows)
      this.looping = res.data.rows
      // console.log(this.looping)
    }).catch((err) => {
      console.log(err)
    })
  },
  methods: {}
}
</script>
<style>
.home {
  width: 1200px;
  margin: 0 auto;
  /*background: aqua;*/
}

.loop {
  height: 300px;
}

.loop img {
  width: 100%;
  height: 300px;
  object-fit: cover;
}
</style>