<template>
    <div id="topic-details" >
        <h1>Forum Topic Title</h1>
        <router-link :to="{ name: 'add-message'}">Add New Message</router-link>
        
        <h3>{{ this.$store.state.messageTitle }}</h3>
        <p>{{ this.$store.state.messageContent }}</p>
    </div>
</template>

<script>

export default {
    name: 'topic-details'
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
#topic-details {
  background-image: url(../assets/paper.jpeg);
  background-repeat: none;
  height: 100vh;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  background-attachment: fixed;
}

</style>