<template>
<div>
  <div>
    <Header></Header>
  </div>
  <div class="main">
    <!--  <xinwen></xinwen>-->
    <div>
      <el-tabs class="main-nav" v-model="activeName" @tab-click="handleClick">
        <el-tab-pane label="ChildQ" name="1"><ChildQ/></el-tab-pane>
        <el-tab-pane label="ChildW" name="2"><ChildW/></el-tab-pane>
        <el-tab-pane label="ChildE" name="3"><ChildE/></el-tab-pane>
        <el-tab-pane label="ChildR" name="4"><ChildR/></el-tab-pane>
        <el-tab-pane label="ChildT" name="5"><ChildT/></el-tab-pane>
        <el-tab-pane label="ChildY" name="6"><ChildY/></el-tab-pane>
        <el-tab-pane label="ChildQ" name="7"><ChildQ/></el-tab-pane>
        <el-tab-pane label="ChildW" name="8"><ChildW/></el-tab-pane>
        <el-tab-pane label="ChildE" name="9"><ChildE/></el-tab-pane>
        <el-tab-pane label="ChildR" name="10"><ChildR/></el-tab-pane>
        <el-tab-pane label="ChildT" name="11"><ChildT/></el-tab-pane>
        <el-tab-pane label="ChildY" name="12"><ChildY/></el-tab-pane>
      </el-tabs>
    </div>
    <ChildQ></ChildQ>
  </div>
</div>
</template>

<script>
import ChildQ from "@/components/Child/ChildQ";
import ChildW from "@/components/Child/ChildW";
import ChildE from "@/components/Child/ChildE";
import ChildR from "@/components/Child/ChildR";
import ChildT from "@/components/Child/ChildT";
import ChildY from "@/components/Child/ChildY";

import xinwen from "@/components/nav";
import Header from "@/components/headerN.vue";
export default {
  name: "Mine",
  // components: {xinwen},
  components:{Header, ChildQ,ChildW,ChildE,ChildR,ChildT,ChildY},
  data(){
    return{
      name: '',
      courses: [],
      rou1: [],
      activeName:'1'
    }
  },
  created() {
  },
  methods: {
    handleClick(tab, event) {
      console.log(tab, event);
    },
  }
}
</script>

<style scoped>
.main{
  width: 1200px;
  margin: 0 auto;
}
.main-nav{
  width: 100%;

}
</style>