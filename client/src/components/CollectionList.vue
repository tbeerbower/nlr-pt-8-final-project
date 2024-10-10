<template>
  <section id="collections">
      <ul id="collection-list">
          <li v-for="collection in collections" v-bind:key="collection.id">
              <div class="collection-item">
                  {{collection.name}}
              </div>
              <ul>
                  <li v-for="dictionary in getDictionaries(collection.id)" v-bind:key="dictionary.id">
                      <div class="dictionary-item">
                          {{dictionary.name}}
                      </div>
                  </li>
              </ul>
          </li>
      </ul>

  </section>
</template>

<script>
export default {

    computed: {
        collections() {
            return this.$store.state.collections;
        },
        dictionaries() {
            return this.$store.state.dictionaries;
        }
    },
    methods: {
        getDictionaries(collectionId) {
            return this.dictionaries.filter((dictionary) => {
                return dictionary.collectionId == collectionId;
            });
        }
    }
}
</script>

<style>
#collections {
    border-right: 2px solid lightslategray;
    border-bottom: none;
    grid-area: collections;
}

#collections>ul {
    padding: 5px;
    list-style: none;
}

.collapsed+ul {
    display: none;
}

.collection-item>i {
    width:1em;
    padding-right: 5px;
}

.collection-item {
    font-weight: bold;
    padding: 2px;
}

.collection-item:hover {
    background-color: #E9F2EE;
    cursor: pointer;
}

</style>