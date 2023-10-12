<template>
  <div id="app">
    <transition>
      <router-view />
    </transition>
  </div>
</template>

<script>
  export default{
    data(){
      return{

      }
    },
    created(){

    },
    methods:{
      // login(){
      //   this.$router.push('/Login')
      // }

    }
  }
</script>
<style>
#app{
  width: 100%;
  height: 100%;
  background: #f5f5f5;
}

</style>
