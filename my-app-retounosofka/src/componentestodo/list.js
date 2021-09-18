import react,{useEffect} from "react";

const initialState = {
    todo: { list: [], item: {} }
  };
  const Store = createContext(initialState)
  
  

const List = () => {
    const { dispatch, state: { todo } } = useContext(Store);
    const currentList = todo.list;
  
    useEffect(() => {
      fetch(HOST_API + "/todos")
        .then(response => response.json())
        .then((list) => {
          dispatch({ type: "update-list", list })
        })
    }, [dispatch]);
  
  
    const onDelete = (id) => {
      fetch(HOST_API + "/" + id + "/todo", {
        method: "DELETE"
      }).then((list) => {
        dispatch({ type: "delete-item", id })
      })
    };
  
    const onEdit = (todo) => {
      dispatch({ type: "edit-item", item: todo })
    };
  
    const onChange = (event, todo) => {
      const request = {
        name: todo.name,
        id: todo.id,
        completed: event.target.checked
      };
      fetch(HOST_API + "/todo", {
        method: "PUT",
        body: JSON.stringify(request),
        headers: {
          'Content-Type': 'application/json'
        }
      })
        .then(response => response.json())
        .then((todo) => {
          dispatch({ type: "update-item", item: todo });
        });
    };
  
    const decorationDone = {
      textDecoration: 'line-through'
    };

    const StoreProvider = ({ children }) => {
        const [state, dispatch] = useReducer(reducer, initialState);
      
        return <Store.Provider value={{ state, dispatch }}>
          {children}
        </Store.Provider>
      
      }