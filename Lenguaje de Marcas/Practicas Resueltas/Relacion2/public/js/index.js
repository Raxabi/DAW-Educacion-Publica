const $ = element => document.getElementById(element);
const create = elementType => document.createElement(elementType);

const unList = $("un-list");

let listElement, anchorElement;

let exercisePath = [];
let publicExercises = [];

/**
 * #### Iterates over an existing array and search in the array for the inditcated pattern
 * #### Then the pattern is replaced by the indicated replacement
 * 
 * @param {Array} pathArray The first array that contain the not replaced items
 * @param {string[]} pattern The pattern or the exact item that want to replace
 * @param {string} replacePath The replacement that will be in the returned array
 * @returns A new array with the inditaced pattern replaced
 */
function replacePath(pathArray, pattern, replacePath) {
    return pathArray.map(item => item.replace(pattern, replacePath));
}

for (let i = 1; i <= 9; i++) {
    // Creamos un elemento por cada iteracion
    listElement = create("li");
    anchorElement = create("a");

    // Creamos un string con la ruta del archivo y lo añadimos al array
    exercisePath = `./public/Ejercicio${i}.html`;
    publicExercises.push(exercisePath);
    
    // Finalmente añadimos los elementos
    anchorElement.textContent = `Ejercicio ${i}`;
    unList.appendChild(listElement).appendChild(anchorElement);
    listElement.setAttribute("id", "list-Element");
    
    replacePath(publicExercises, "./public/Ejercicio2.html", "./public/Ejercicio2/index.html")
        .forEach(item => {
            anchorElement.setAttribute("href", item);
        })

    replacePath(publicExercises, "./public/Ejercicio3.html", "./public/Ejercicio3/index.html")
        .forEach(item => {
            anchorElement.setAttribute("href", item);
        })
}