import React from 'react';
import './App.css';
import UserList from './components/UserList';

class App extends React.Component {

  constructor(props) {
    super(props);
    this.state = { 
      userList: [{id:"",name:"", email:""}],
    };
    
  }

  componentDidMount() {
    fetch('https://agile-depths-61285.herokuapp.com/user')
      .then(response => response.json())
      .then(data => {
        console.log(data);
        let userList = [];
        data.forEach(function (user) {
          console.log(user);
          userList.push(user)
        
        });
        console.log(this.state.userList)
        this.setState({ userList: userList });
        console.log(this.state.userList)
        
            });
  }

  render() {
   
    return (
      <div>
        <h2> Consumo desde la API</h2>
        {/* {alert(this.state.userList)} */}
        <UserList usersList={this.state.userList} /> 
        {/* <h5>{this.state.userList}</h5>  */}
      </div>
    );
  }
}

export default App;