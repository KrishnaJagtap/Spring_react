import React from 'react';
import UserService from '../services/UserService';

class UserComponent extends React.Component{
constructor(props)
{
    super(props)
     this.state ={
    courses:[]
         }

}
componentDidMount(){

    UserService.getUsers().then((response)=>{
this.setState({courses:response.data})

    });
}

render (){
    return(
<div>
<h1 className="text-center">COURSES LIST</h1>
<table className="table-striped">
<thead>
    <tr>
        <td>  Course Id</td>
        <td>  Course Title</td>
        <td>  Course Details</td>
    </tr>
</thead>
<tbody>

    {

        this.state.courses.map(
course =>
<tr key={course.id}>
        <td>{course.id} </td>
        <td>{course.title} </td>
        <td>{course.details} </td>

</tr>


        )
    }
</tbody>

</table>

</div>
    )

}

}


export default UserComponent