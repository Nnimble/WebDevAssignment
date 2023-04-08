function filterTable(tableId) {
    var allTable = document.getElementById("all-table");
    var bahrainTable = document.getElementById("bahrain-table");
    var saudiArabiaTable = document.getElementById("saudi-arabia-table");
    var australiaTable = document.getElementById("australia-table");
  
    switch(tableId) {
      case "all":
        allTable.style.display = "block";
        bahrainTable.style.display = "none";
        saudiArabiaTable.style.display = "none";
        australiaTable.style.display = "none";
        break;
      case "bahrain":
        allTable.style.display = "none";
        bahrainTable.style.display = "block";
        saudiArabiaTable.style.display = "none";
        australiaTable.style.display = "none";
        break;
      case "saudi-arabia":
        allTable.style.display = "none";
        bahrainTable.style.display = "none";
        saudiArabiaTable.style.display = "block";
        australiaTable.style.display = "none";
        break;
      case "australia":
        allTable.style.display = "none";
        bahrainTable.style.display = "none";
        saudiArabiaTable.style.display = "none";
        australiaTable.style.display = "block";
        break;
    }
  }
  