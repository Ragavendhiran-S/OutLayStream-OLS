import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './index.css'; // Import your existing CSS for consistent styling

const Dashboard = () => {
  // const [totalSpent, setTotalSpent] = useState(0);
  // const [categories, setCategories] = useState([]);

  // Fetching analysis data
  // useEffect(() => {
  //   const fetchData = async () => {
  //     try {
  //       const response = await axios.get('/api/dashboard'); // Adjust the endpoint as necessary
  //       setTotalSpent(response.data.totalSpent);
  //       setCategories(response.data.categories);
  //     } catch (error) {
  //       console.error('Error fetching data', error);
  //     }
  //   };

  //   fetchData();
  // }, []);

  return (
    <div className="dashboard-container">
      <h2>Dashboard</h2>
      <div className="stats">
        <div className="stat-item">
          <h3>Total Spent</h3>
          {/* <p>${totalSpent.toFixed(2)}</p> */}
        </div>
        <div className="stat-item">
          <h3>Categories</h3>
          <ul>
            {/* {categories.map((category, index) => (
              <li key={index}>
                {category.name}: ${category.amount.toFixed(2)}
              </li>
            ))} */}
          </ul>
        </div>
      </div>
    </div>
  );
};

export default Dashboard;
