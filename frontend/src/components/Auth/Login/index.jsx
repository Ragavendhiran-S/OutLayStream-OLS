import './index.css';

const Login = () => {

  return (
    <div className="login-container">
      <form className="login-form">
        <h2>Login</h2>
        <div className="input-group">
          <label>Username</label>
          <input type="text" placeholder="Enter your username" />
        </div>
        <div className="input-group">
          <label>Password</label>
          <input type="password" placeholder="Enter your password" />
        </div>
        <button type="submit" className="login-btn">Login</button>
        <b style={{ justifyContent: 'center',display: 'flex', marginTop: '10px'}}>
          <div style={{marginRight: '10px'}}>
            New user?
          </div>
          <a href="/register">Register</a></b>
      </form>
    </div>
  );
};

export default Login;
