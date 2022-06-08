<template>
  <div class="topic-list">
    <table class="table table-hover">
      <thead>
        <tr>
          <th>Topic</th>
          <th>Delete</th>
        </tr>
      </thead>

      <tbody>
        <tr
          class="table-primary"
          v-for="topic in topics"
          v-bind:key="topic.forumID"
        >
          <td width="80%">
            <router-link
              v-bind:to="{ name: 'Messages', params: { id: forum.id } }"
            >
              {{ forum.forumTopic }}</router-link
            >
          </td>
          <a href="#" v-on:click="deleteTopic(topic.id)">Delete</a>
        </tr>
      </tbody>
    </table>
  </div>
</template>


<script>
export default {
  components: {},
  name: "topic-list",
  props: {
    topics: Array,
    //getting the array of books from "Home View"
  },
  data() {
    return {
      topic: {
        forumID: "",
        userID: "",
        forumTopic: "",
        forumDate: "",
      },
    };
  },
};
</script>


<style>
.topic-list {
  margin: 0 auto;
  max-width: 800px;
}
.topic {
  font-size: 24px;
  border-bottom: 1px solid #f2f2f2;
  padding: 10px 20px;
}
.topic:last-child {
  border: 0px;
}
table {
  text-align: left;
  width: 800px;
  border-collapse: collapse;
}
td {
  padding: 4px;
}
tbody tr:nth-child(even) {
  background-color: #f2f2f2;
}

.topic-list a:link,
.topic-list a:visited {
  color: #f3969a;
  text-decoration: none;
}
.topic-list a:hover {
  text-decoration: underline;
}
</style>