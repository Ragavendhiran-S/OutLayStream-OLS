import './styles/App.css';
import Login from './components/Auth/Login';  // Import your pages
import Register from './components/Auth/Register';
import Dashboard from './components/Dashboard';
import Expenses from './components/Expenses';
import Categories from './components/Categories';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';

function App() {
  return (
    <div className="container">
      <BrowserRouter>
        {/* Navigation only for certain routes */}
        {window.location.pathname !== '/login' && window.location.pathname !== '/register' && (
          <nav className="navbar">
            <div className="navbar-brand">BrandName</div>
            <ul className="navbar-links">
              <li><Link to="/">Dashboard</Link></li>
              <li><Link to="/category">Category</Link></li>
              <li><Link to="/expenses">Expenses</Link></li>
            </ul>
          </nav>
        )}


        <Routes>
          <Route path="/" element={<Login />} />         {/* Default route (Login) */}
          <Route path="/login" element={<Login />} />         {/* Default route (Login) */}
          <Route path="/register" element={<Register />} />  {/* Registration page */}
          <Route path="/dashboard" element={<Dashboard />} /> {/* Dashboard page */}
          <Route path="/expenses" element={<Expenses />} />   {/* Expenses page */}
          <Route path="/categories" element={<Categories />} /> {/* Categories page */}
        </Routes>

      </BrowserRouter>
    </div>
  );
}

export default App;
