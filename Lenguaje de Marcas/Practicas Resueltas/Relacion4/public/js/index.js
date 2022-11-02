const $ = (element) => document.getElementById(element);
const create = (element) => document.createElement(element);

const unList = $("un-list");

for (let i = 1; i <= 5 ; i++) {
    const li = create("li");
    const anchor = create("a");
    
    unList.appendChild(li)
        .appendChild(anchor);

    anchor.textContent = `Ejercicio${i}`;
    li.setAttribute("id", "list-element");
    anchor.setAttribute("href", `./public/Ejercicio${i}.html`);
}