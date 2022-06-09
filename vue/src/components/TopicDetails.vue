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
.topic-details .bubble {
  box-sizing: border-box;
  width: auto;
  position: relative;
  clear: both;

  background: #95c2fd;
  background-image: -webkit-gradient(
    linear,
    left bottom,
    left top,
    color-stop(0.15, #bee2ff),
    color-stop(1, #95c2fd)
  );
  background-image: -webkit-linear-gradient(bottom, #c7ecd3 15%, #78c2ad 100%);
  background-image: -moz-linear-gradient(bottom, #c7ecd3 15%, #78c2ad 100%);
  background-image: -ms-linear-gradient(bottom, #c7ecd3 15%, #78c2ad 100%);
  background-image: -o-linear-gradient(bottom, #c7ecd3 15%, #78c2ad 100%);
  background-image: linear-gradient(to top, #c7ecd3 15%, #78c2ad 100%);
  filter: progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr='#78c2ad', endColorstr='#c7ecd3');

  border: solid 1px rgba(0, 0, 0, 0.5);
  -webkit-border-radius: 20px;
  -moz-border-radius: 20px;
  border-radius: 20px;

  -webkit-box-shadow: inset 0 8px 5px rgba(255, 255, 255, 0.65),
    0 1px 2px rgba(0, 0, 0, 0.2);
  -moz-box-shadow: inset 0 8px 5px rgba(255, 255, 255, 0.65),
    0 1px 2px rgba(0, 0, 0, 0.2);
  box-shadow: inset 0 8px 5px rgba(255, 255, 255, 0.65),
    0 1px 2px rgba(0, 0, 0, 0.2);
  margin-bottom: 20px;
  padding: 6px 20px;
  color: #000;
  text-shadow: 0 1px 1px rgba(255, 255, 255, 0.8);
  word-wrap: break-word;
}

.addMessage {
  display: block;
  padding: 0 0 10px 10px;
}
</style>