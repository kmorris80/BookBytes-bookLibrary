<template>
    <div id="topic-details" >
      <h1>{{ this.$store.state.topicTitle }}</h1>
      <router-link :to="{ name: 'add-message'}">Add New Message</router-link>
      <div id="message-bubble" v-for="message in this.$store.state.messages" :key="message.id">
        <h3>{{ message.title }}</h3>
        <p>{{ message.content }}</p>
      </div>
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