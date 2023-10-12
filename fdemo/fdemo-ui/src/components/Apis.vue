<template>
    <div style="background: aqua;width: 200px;height: 200px">
        <div v-for="(apis,index) in apis" :key="index">
            <p>{{apis.content}}</p>
            <p>code{{apis.code}}</p>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Api",
        data(){
            return{
                keys:'4c4a0a60f121ef5b30e5ecd43d4ae3dc',
                apis:[]
            }
        },
        created() {
            this.$axios({
                url:'https://apis.tianapi.com/zaoan/index?+'+ this.keys,
                method:'post'
            }).then((res)=>{
                this.apis = res.data
                console.log(res.data)
            }).catch((err)=>{
                console.log(err)
            })
        }
    }
</script>

<style scoped>

</style>