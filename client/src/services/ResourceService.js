const allResources = [
  // add objects to represent your custom application resources here
];


const collections = [
  {
      id: 1,
      name: "Tom's Dictionary Collection"
  },
  {
      id: 2,
      name: "Foreign Language Dictionaries"
  }
];

const dictionaries = [
  {
      id: 3,
      name: "English to Spanish",
      collectionId: 2
  },
  {
      id: 4,
      name: "Disc Golf Terms",
      collectionId: 1
  },
  {
      id: 5,
      name: "Gardening Terms",
      collectionId: 1
  }
];

const entries = [
  {
    id: 473,
    dictionaryId: 3,
    word: "air conditioner",
    pos: "n.",
    definition: "aire acondicionado"
  },
  {
    id: 463,
    dictionaryId: 3,
    word: "alarm",
    pos: "n.",
    definition: "alarma"
  },
  {
    id: 414,
    dictionaryId: 3,
    word: "apple",
    pos: "n.",
    definition: "manzana"
  },
  {
    id: 451,
    dictionaryId: 3,
    word: "backpack",
    pos: "n.",
    definition: "mochila"
  },
  {
    id: 484,
    dictionaryId: 3,
    word: "bath",
    pos: "n.",
    definition: "baño"
  },
  {
    id: 464,
    dictionaryId: 3,
    word: "bed",
    pos: "n.",
    definition: "cama"
  },
  {
    id: 466,
    dictionaryId: 3,
    word: "blanket",
    pos: "n.",
    definition: "manta"
  },
  {
    id: 415,
    dictionaryId: 3,
    word: "book",
    pos: "n.",
    definition: "libro"
  },
  {
    id: 431,
    dictionaryId: 3,
    word: "bread",
    pos: "n.",
    definition: "pan"
  },
  {
    id: 475,
    dictionaryId: 3,
    word: "broom",
    pos: "n.",
    definition: "escoba"
  },
  {
    id: 477,
    dictionaryId: 3,
    word: "bucket",
    pos: "n.",
    definition: "cubeta"
  },
  {
    id: 462,
    dictionaryId: 3,
    word: "calendar",
    pos: "n.",
    definition: "calendario"
  },
  {
    id: 416,
    dictionaryId: 3,
    word: "car",
    pos: "n.",
    definition: "coche"
  },
  {
    id: 430,
    dictionaryId: 3,
    word: "cat",
    pos: "n.",
    definition: "gato"
  },
  {
    id: 434,
    dictionaryId: 3,
    word: "chair",
    pos: "n.",
    definition: "silla"
  },
  {
    id: 433,
    dictionaryId: 3,
    word: "cheese",
    pos: "n.",
    definition: "queso"
  },
  {
    id: 460,
    dictionaryId: 3,
    word: "clock",
    pos: "n.",
    definition: "reloj"
  },
  {
    id: 468,
    dictionaryId: 3,
    word: "closet",
    pos: "n.",
    definition: "armario"
  },
  {
    id: 441,
    dictionaryId: 3,
    word: "computer",
    pos: "n.",
    definition: "computadora"
  },
  {
    id: 417,
    dictionaryId: 3,
    word: "dog",
    pos: "n.",
    definition: "perro"
  },
  {
    id: 437,
    dictionaryId: 3,
    word: "door",
    pos: "n.",
    definition: "puerta"
  },
  {
    id: 469,
    dictionaryId: 3,
    word: "drawer",
    pos: "n.",
    definition: "cajón"
  },
  {
    id: 418,
    dictionaryId: 3,
    word: "egg",
    pos: "n.",
    definition: "huevo"
  },
  {
    id: 456,
    dictionaryId: 3,
    word: "envelope",
    pos: "n.",
    definition: "sobre"
  },
  {
    id: 449,
    dictionaryId: 3,
    word: "eraser",
    pos: "n.",
    definition: "borrador"
  },
  {
    id: 471,
    dictionaryId: 3,
    word: "fan",
    pos: "n.",
    definition: "ventilador"
  },
  {
    id: 419,
    dictionaryId: 3,
    word: "fish",
    pos: "n.",
    definition: "pez"
  },
  {
    id: 420,
    dictionaryId: 3,
    word: "grape",
    pos: "n.",
    definition: "uva"
  },
  {
    id: 472,
    dictionaryId: 3,
    word: "heater",
    pos: "n.",
    definition: "calefactor"
  },
  {
    id: 421,
    dictionaryId: 3,
    word: "house",
    pos: "n.",
    definition: "casa"
  },
  {
    id: 422,
    dictionaryId: 3,
    word: "ice",
    pos: "n.",
    definition: "hielo"
  },
  {
    id: 423,
    dictionaryId: 3,
    word: "juice",
    pos: "n.",
    definition: "jugo"
  },
  {
    id: 424,
    dictionaryId: 3,
    word: "key",
    pos: "n.",
    definition: "llave"
  },
  {
    id: 444,
    dictionaryId: 3,
    word: "keyboard",
    pos: "n.",
    definition: "teclado"
  },
  {
    id: 470,
    dictionaryId: 3,
    word: "lamp",
    pos: "n.",
    definition: "lámpara"
  },
  {
    id: 425,
    dictionaryId: 3,
    word: "lemon",
    pos: "n.",
    definition: "limón"
  },
  {
    id: 455,
    dictionaryId: 3,
    word: "letter",
    pos: "n.",
    definition: "carta"
  },
  {
    id: 453,
    dictionaryId: 3,
    word: "magazine",
    pos: "n.",
    definition: "revista"
  },
  {
    id: 426,
    dictionaryId: 3,
    word: "milk",
    pos: "n.",
    definition: "leche"
  },
  {
    id: 485,
    dictionaryId: 3,
    word: "mirror",
    pos: "n.",
    definition: "espejo"
  },
  {
    id: 445,
    dictionaryId: 3,
    word: "monitor",
    pos: "n.",
    definition: "monitor"
  },
  {
    id: 476,
    dictionaryId: 3,
    word: "mop",
    pos: "n.",
    definition: "fregona"
  },
  {
    id: 443,
    dictionaryId: 3,
    word: "mouse",
    pos: "n.",
    definition: "ratón"
  },
  {
    id: 454,
    dictionaryId: 3,
    word: "newspaper",
    pos: "n.",
    definition: "periódico"
  },
  {
    id: 427,
    dictionaryId: 3,
    word: "night",
    pos: "n.",
    definition: "noche"
  },
  {
    id: 447,
    dictionaryId: 3,
    word: "notebook",
    pos: "n.",
    definition: "cuaderno"
  },
  {
    id: 428,
    dictionaryId: 3,
    word: "orange",
    pos: "n.",
    definition: "naranja"
  },
  {
    id: 458,
    dictionaryId: 3,
    word: "package",
    pos: "n.",
    definition: "paquete"
  },
  {
    id: 452,
    dictionaryId: 3,
    word: "paper",
    pos: "n.",
    definition: "papel"
  },
  {
    id: 429,
    dictionaryId: 3,
    word: "pen",
    pos: "n.",
    definition: "bolígrafo"
  },
  {
    id: 448,
    dictionaryId: 3,
    word: "pencil",
    pos: "n.",
    definition: "lápiz"
  },
  {
    id: 442,
    dictionaryId: 3,
    word: "phone",
    pos: "n.",
    definition: "teléfono"
  },
  {
    id: 465,
    dictionaryId: 3,
    word: "pillow",
    pos: "n.",
    definition: "almohada"
  },
  {
    id: 459,
    dictionaryId: 3,
    word: "postcard",
    pos: "n.",
    definition: "tarjeta postal"
  },
  {
    id: 446,
    dictionaryId: 3,
    word: "printer",
    pos: "n.",
    definition: "impresora"
  },
  {
    id: 438,
    dictionaryId: 3,
    word: "school",
    pos: "n.",
    definition: "escuela"
  },
  {
    id: 479,
    dictionaryId: 3,
    word: "shampoo",
    pos: "n.",
    definition: "champú"
  },
  {
    id: 450,
    dictionaryId: 3,
    word: "sharpener",
    pos: "n.",
    definition: "sacapuntas"
  },
  {
    id: 467,
    dictionaryId: 3,
    word: "sheet",
    pos: "n.",
    definition: "sábana"
  },
  {
    id: 483,
    dictionaryId: 3,
    word: "shower",
    pos: "n.",
    definition: "ducha"
  },
  {
    id: 486,
    dictionaryId: 3,
    word: "sink",
    pos: "n.",
    definition: "fregadero"
  },
  {
    id: 478,
    dictionaryId: 3,
    word: "soap",
    pos: "n.",
    definition: "jabón"
  },
  {
    id: 457,
    dictionaryId: 3,
    word: "stamp",
    pos: "n.",
    definition: "sello"
  },
  {
    id: 440,
    dictionaryId: 3,
    word: "student",
    pos: "n.",
    definition: "estudiante"
  },
  {
    id: 435,
    dictionaryId: 3,
    word: "table",
    pos: "n.",
    definition: "mesa"
  },
  {
    id: 439,
    dictionaryId: 3,
    word: "teacher",
    pos: "n.",
    definition: "profesor"
  },
  {
    id: 480,
    dictionaryId: 3,
    word: "toothbrush",
    pos: "n.",
    definition: "cepillo de dientes"
  },
  {
    id: 481,
    dictionaryId: 3,
    word: "toothpaste",
    pos: "n.",
    definition: "pasta de dientes"
  },
  {
    id: 482,
    dictionaryId: 3,
    word: "towel",
    pos: "n.",
    definition: "toalla"
  },
  {
    id: 474,
    dictionaryId: 3,
    word: "vacuum",
    pos: "n.",
    definition: "aspiradora"
  },
  {
    id: 461,
    dictionaryId: 3,
    word: "watch",
    pos: "n.",
    definition: "reloj"
  },
  {
    id: 432,
    dictionaryId: 3,
    word: "water",
    pos: "n.",
    definition: "agua"
  },
  {
    id: 436,
    dictionaryId: 3,
    word: "window",
    pos: "n.",
    definition: "ventana"
  },
  {
    id: 487,
    dictionaryId: 4,
    word: "Ace",
    pos: "n.",
    definition: "A hole-in-one; when the disc lands in the basket on the first throw."
  },
  {
    id: 488,
    dictionaryId: 4,
    word: "Albatross",
    pos: "n.",
    definition: "Completing a hole three strokes under par."
  },
  {
    id: 489,
    dictionaryId: 4,
    word: "Anhyzer",
    pos: "n.",
    definition: "A throw where the disc is released with an angle causing it to turn opposite of the natural flight path."
  },
  {
    id: 490,
    dictionaryId: 4,
    word: "Approach",
    pos: "n.",
    definition: "A throw intended to land the disc near the basket."
  },
  {
    id: 491,
    dictionaryId: 4,
    word: "Backhand",
    pos: "n.",
    definition: "A throw where the disc is released from across the body with the back of the hand facing the target."
  },
  {
    id: 492,
    dictionaryId: 4,
    word: "Birdie",
    pos: "n.",
    definition: "Completing a hole one stroke under par."
  },
  {
    id: 493,
    dictionaryId: 4,
    word: "Bogey",
    pos: "n.",
    definition: "Completing a hole one stroke over par."
  },
  {
    id: 494,
    dictionaryId: 4,
    word: "Card",
    pos: "n.",
    definition: "The group of players competing together in a round."
  },
  {
    id: 495,
    dictionaryId: 4,
    word: "Chain",
    pos: "n.",
    definition: "The metal chains in the basket that help catch the disc."
  },
  {
    id: 496,
    dictionaryId: 4,
    word: "Circle 1",
    pos: "n.",
    definition: "The area within 10 meters (about 33 feet) of the basket."
  },
  {
    id: 497,
    dictionaryId: 4,
    word: "Circle 2",
    pos: "n.",
    definition: "The area between 10 and 20 meters (about 33 to 66 feet) from the basket."
  },
  {
    id: 498,
    dictionaryId: 4,
    word: "Driver",
    pos: "n.",
    definition: "A type of disc designed for maximum distance."
  },
  {
    id: 499,
    dictionaryId: 4,
    word: "Eagle",
    pos: "n.",
    definition: "Completing a hole two strokes under par."
  },
  {
    id: 500,
    dictionaryId: 4,
    word: "Fade",
    pos: "n.",
    definition: "The tendency of a disc to hook left (for right-handed backhand throwers) at the end of its flight."
  },
  {
    id: 501,
    dictionaryId: 4,
    word: "Fairway",
    pos: "n.",
    definition: "The in-bounds path leading to the basket."
  },
  {
    id: 502,
    dictionaryId: 4,
    word: "Forehand",
    pos: "n.",
    definition: "A throw where the disc is released from the side of the body with the palm facing the target."
  },
  {
    id: 503,
    dictionaryId: 4,
    word: "Griplock",
    pos: "n.",
    definition: "When the disc is released too late, often resulting in an undesired throw direction."
  },
  {
    id: 504,
    dictionaryId: 4,
    word: "Hyzer",
    pos: "n.",
    definition: "A throw where the disc is released with an angle causing it to follow its natural flight path."
  },
  {
    id: 505,
    dictionaryId: 4,
    word: "Lie",
    pos: "n.",
    definition: "The spot where the previous throw landed, from which the next throw is made."
  },
  {
    id: 506,
    dictionaryId: 4,
    word: "Midrange",
    pos: "n.",
    definition: "A type of disc designed for control and accuracy over distance."
  },
  {
    id: 507,
    dictionaryId: 4,
    word: "OB (Out of Bounds)",
    pos: "n.",
    definition: "Areas designated as out-of-play, resulting in a penalty stroke if the disc lands there."
  },
  {
    id: 508,
    dictionaryId: 4,
    word: "Overstable",
    pos: "n.",
    definition: "A disc that has a strong tendency to fade left (for right-handed backhand throwers)."
  },
  {
    id: 509,
    dictionaryId: 4,
    word: "Par",
    pos: "n.",
    definition: "The number of throws expected to complete the hole."
  },
  {
    id: 510,
    dictionaryId: 4,
    word: "Putter",
    pos: "n.",
    definition: "A type of disc designed for short, controlled throws into the basket."
  },
  {
    id: 511,
    dictionaryId: 4,
    word: "Roller",
    pos: "n.",
    definition: "A throw where the disc is intended to land on its edge and roll."
  },
  {
    id: 512,
    dictionaryId: 4,
    word: "S-curve",
    pos: "n.",
    definition: "A throw where the disc turns in one direction before fading back in the other direction."
  },
  {
    id: 513,
    dictionaryId: 4,
    word: "Stable",
    pos: "n.",
    definition: "A disc that flies straight with minimal turn or fade."
  },
  {
    id: 514,
    dictionaryId: 4,
    word: "Tee Pad",
    pos: "n.",
    definition: "The designated area where the first throw of each hole is made."
  },
  {
    id: 515,
    dictionaryId: 4,
    word: "Turn",
    pos: "n.",
    definition: "The tendency of a disc to curve right (for right-handed backhand throwers) early in its flight."
  },
  {
    id: 516,
    dictionaryId: 4,
    word: "Understable",
    pos: "n.",
    definition: "A disc that has a strong tendency to turn right (for right-handed backhand throwers)."
  },
  {
    id: 517,
    dictionaryId: 5,
    word: "Annual",
    pos: "n.",
    definition: "A plant that completes its life cycle in one growing season."
  },
  {
    id: 518,
    dictionaryId: 5,
    word: "Biennial",
    pos: "n.",
    definition: "A plant that completes its life cycle in two growing seasons."
  },
  {
    id: 519,
    dictionaryId: 5,
    word: "Compost",
    pos: "n.",
    definition: "Decomposed organic matter used to improve soil structure and provide nutrients."
  },
  {
    id: 538,
    dictionaryId: 5,
    word: "Composting",
    pos: "v.",
    definition: "The process of recycling organic matter, such as leaves and food scraps, into fertilizer."
  },
  {
    id: 520,
    dictionaryId: 5,
    word: "Cultivate",
    pos: "v.",
    definition: "To prepare and work on (soil) to promote the growth of plants."
  },
  {
    id: 539,
    dictionaryId: 5,
    word: "Deadheading",
    pos: "v.",
    definition: "The removal of dead flowers from a plant to encourage further blooming."
  },
  {
    id: 521,
    dictionaryId: 5,
    word: "Fertilizer",
    pos: "n.",
    definition: "A substance added to soil to enhance the growth of plants."
  },
  {
    id: 540,
    dictionaryId: 5,
    word: "Foliar",
    pos: "adj.",
    definition: "Relating to or having to do with leaves."
  },
  {
    id: 522,
    dictionaryId: 5,
    word: "Germinate",
    pos: "v.",
    definition: "To begin to grow or sprout from a seed."
  },
  {
    id: 541,
    dictionaryId: 5,
    word: "Grafting",
    pos: "v.",
    definition: "The process of joining two plants together so that they grow as one."
  },
  {
    id: 542,
    dictionaryId: 5,
    word: "Hardening off",
    pos: "v.",
    definition: "The process of gradually acclimatizing indoor or greenhouse plants to outdoor conditions."
  },
  {
    id: 543,
    dictionaryId: 5,
    word: "Heirloom",
    pos: "adj.",
    definition: "A traditional variety of plant that has been passed down through generations."
  },
  {
    id: 523,
    dictionaryId: 5,
    word: "Herbaceous",
    pos: "adj.",
    definition: "Plants with non-woody stems that die back at the end of the growing season."
  },
  {
    id: 544,
    dictionaryId: 5,
    word: "Horticulture",
    pos: "n.",
    definition: "The art or practice of garden cultivation and management."
  },
  {
    id: 545,
    dictionaryId: 5,
    word: "Humus",
    pos: "n.",
    definition: "Rich, dark organic material formed by the decay of vegetable matter, essential to soil fertility."
  },
  {
    id: 524,
    dictionaryId: 5,
    word: "Hydroponics",
    pos: "n.",
    definition: "A method of growing plants without soil, using nutrient-rich water."
  },
  {
    id: 525,
    dictionaryId: 5,
    word: "Irrigation",
    pos: "n.",
    definition: "The artificial application of water to soil to assist in growing crops."
  },
  {
    id: 526,
    dictionaryId: 5,
    word: "Mulch",
    pos: "n.",
    definition: "A material spread over soil to retain moisture, suppress weeds, and regulate temperature."
  },
  {
    id: 527,
    dictionaryId: 5,
    word: "Perennial",
    pos: "n.",
    definition: "A plant that lives for more than two years."
  },
  {
    id: 528,
    dictionaryId: 5,
    word: "Photosynthesis",
    pos: "n.",
    definition: "The process by which green plants use sunlight to synthesize foods from carbon dioxide and water."
  },
  {
    id: 529,
    dictionaryId: 5,
    word: "Pruning",
    pos: "v.",
    definition: "The selective removal of certain parts of a plant, such as branches, buds, or roots."
  },
  {
    id: 530,
    dictionaryId: 5,
    word: "Rhizome",
    pos: "n.",
    definition: "A continuously growing horizontal underground stem that puts out lateral shoots and adventitious roots at intervals."
  },
  {
    id: 531,
    dictionaryId: 5,
    word: "Seedling",
    pos: "n.",
    definition: "A young plant, especially one raised from seed and not from a cutting."
  },
  {
    id: 532,
    dictionaryId: 5,
    word: "Sow",
    pos: "v.",
    definition: "To plant seeds in the ground for growth."
  },
  {
    id: 533,
    dictionaryId: 5,
    word: "Thinning",
    pos: "v.",
    definition: "The process of removing excess plants to allow remaining plants more space to grow."
  },
  {
    id: 534,
    dictionaryId: 5,
    word: "Transplant",
    pos: "v.",
    definition: "To move a plant from one location to another."
  },
  {
    id: 535,
    dictionaryId: 5,
    word: "Trowel",
    pos: "n.",
    definition: "A small handheld tool with a curved scoop for lifting plants or earth."
  },
  {
    id: 536,
    dictionaryId: 5,
    word: "Vermiculture",
    pos: "n.",
    definition: "The use of worms to decompose organic food waste, turning it into nutrient-rich material for plants."
  },
  {
    id: 537,
    dictionaryId: 5,
    word: "Weed",
    pos: "n.",
    definition: "A wild plant growing where it is not wanted and in competition with cultivated plants."
  }
];

const resourceService = {
  getResources() {
    return allResources;
  },
  getCollections() {
    return collections;
  },
  getDictionaries(){
    return dictionaries;
  },
  getAllEntries() {
    return entries;
  },
  getEntries(dictionaryId) {
    return entries.filter((entry) => {
      return entry.dictionaryId == dictionaryId;
    });
  }
};

export { resourceService };
