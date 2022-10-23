const $ = (id) => document.getElementById(id)
const create = (element) => document.createElement(element)

const list = $("un-list")

for (let i = 1; i <= 10; i++) {
    const li = create("li")    
    const a = create("a")
    list.appendChild(li).appendChild(a)
    li.setAttribute("id", "listElement")
    a.textContent = `Ejercicio${i}`
    a.setAttribute("href", `./public/Ejercicio${i}.html`)
}
