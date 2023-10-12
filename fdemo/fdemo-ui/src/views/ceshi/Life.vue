<template>
    <div class="Life">
        <Header></Header>
        <Nav></Nav>
    </div>
</template>

<script>
    import Header from "@/components/headerN.vue";
    import Nav from "@/components/nav";
    export default {
        name: "Life",
        comments:{Header,Nav}
    }
</script>

<style scoped>
    .Life{
        width: 1200px;
        margin: 0 auto;
        /*background: aqua;*/
    }
</style>