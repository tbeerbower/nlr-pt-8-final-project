<template>
  <section>
    <table id="entry-table">
      <thead id="entry-table-head">
        <tr>
          <th>Word</th>
          <th>Definition</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="entry in entries" v-bind:key="entry.id">
          <td id="entry-word">{{ entry.word }}</td>
          <td>{{ entry.definition }}</td>
        </tr>
      </tbody>
    </table>
  </section>
</template>

<script>
export default {
  computed: {
    entries() {
      return this.$store.state.entries;
    },
  },
};
</script>

<style>
#entries {
  grid-area: entries;
  overflow: auto;
}

#entry-table {
  border-collapse: collapse;
  border: none;
  flex: 100% 1 1;
}

#entries th {
  position: sticky;
  top: 0;
  background-color: lightsteelblue;
  z-index: 1;
}

#entries tr:nth-child(odd) {
  background-color: mintcream;
}

#entries tr:nth-child(even) {
  background-color: lavender;
}

#entries td {
  border: 1px solid lightslategray;
  padding: 2px 5px 2px 5px;
}

#entries tr:first-child td {
  border-top: none;
}

#entries tr:last-child td {
  border-bottom: none;
}

#entries tr td:first-child {
  border-left: none;
}

#entries tr td:last-child {
  border-right: none;
}

.entry-word {
  font-weight: bold;
}
</style>