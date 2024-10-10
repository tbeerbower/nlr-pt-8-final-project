<template>
  <div id="main">
    <div id="current-dictionary-header">
      <h2>Dictionary</h2>
      <form>
        <input type="text" placeholder="filter" id="filter-input" />
      </form>
    </div>
    <collection-list id="collections"/>
    <entry-list id="entries"/>
  </div>
</template>

<script>
import CollectionList from "../components/CollectionList.vue";
import EntryList from "../components/EntryList.vue";
import { resourceService } from "../services/ResourceService.js";

export default {
  components: { CollectionList, EntryList },
  created() {
    const collections = resourceService.getCollections();
    this.$store.commit("SET_COLLECTIONS", collections);
    const dictionaries = resourceService.getDictionaries();
    this.$store.commit("SET_DICTIONARIES", dictionaries);
    const entries = resourceService.getAllEntries();
    this.$store.commit("SET_ENTRIES", entries);
  },
};
</script>

<style>
#current-dictionary-header {
  display: flex;
  flex-direction: column;
  grid-area: dictionary-head;
  align-items: center;
  background-color: navy;
}

#current-dictionary-header h2 {
  margin: 1px;
  color: goldenrod;
}

#filter-input {
  margin-bottom: 2px;
  border: 2px solid lightslategray;
}

section {
  background-color: mintcream;
}

#main {
    background-color: white;
    grid-area: main;
    display: grid;
    grid-template-rows: auto 1fr;
    grid-template-columns: auto 1fr;
    grid-template-areas: 
        "dictionary-head dictionary-head"
        "collections     entries";
    overflow:auto;
}

#current-dictionary-header {
  grid-area: dictionary-head;
}

#collections {
  grid-area: collections;
}

#entries {
  grid-area: entries;

}
</style>