<template>
    <div id="topic-details" >
        <h1>Forum Topic Title</h1>
        <router-link :to="{ name: 'add-message'}">Add New Message</router-link>
        <!-- Create a div looping through forum comments by forum id to get all forum specific messages-->
        <h3>Message title</h3>
        <p>Body of Message</p>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>

#topic-details {
  text-align: center;
}

h1 {
    padding-top: 20px;
}

h3 {
    padding-top: 20px;
}

</style>