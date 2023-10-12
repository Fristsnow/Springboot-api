<template>
    <div class="zhiyuan">
        <Header></Header>
        <Nav></Nav>
        <ChildQ></ChildQ>
    </div>
</template>

<script>
    import Header from "@/components/headerN.vue";
    import Nav from '@/components/nav'
    import ChildQ from "@/components/Child/ChildQ";
    export default {
        name: "zhiyuan",
        components: {
            Header,
            ChildQ,
            Nav
        },
    }
</script>

<style scoped>
    .zhiyuan{
        width: 1200px;
        margin: 0 auto;
        /*background: aqua;*/
    }
</style>