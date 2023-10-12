<template>
    <div class="Lajifenlei">
        <Header></Header>
        <Nav></Nav>
        <ChildQ></ChildQ>
    </div>
</template>

<script>
    import Header from "@/components/headerN.vue";
    import ChildQ from "@/components/Child/ChildQ";
    import Nav from "@/components/nav";

    export default {
        name: "Lajifenlei",
        components: {
            Header,
            ChildQ,
            Nav
        },
        data(){
            return{
                xuanzhong: '/Lajifenlei'
            }
        }
    }
</script>

<style scoped>
    .Lajifenlei{
        width: 1200px;
        margin: 0 auto;
        /*background: aqua;*/
    }
</style>