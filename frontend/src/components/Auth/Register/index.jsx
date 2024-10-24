import './index.css';

const Register = () => {
  return (
    <div className="login-container">
      <form className="login-form">
        <h2>Register</h2>
        <div className="input-group">
          <label>Username</label>
          <input type="text" placeholder="Enter your username" />
        </div>
        <div className="input-group">
          <label>Email</label>
          <input type="email" placeholder="Enter your email" />
        </div>
        <div className="input-group">
          <label>Password</label>
          <input type="password" placeholder="Enter your password" />
        </div>
        <button type="submit" className="login-btn">Register</button>
        <b style={{ justifyContent: 'center', display: 'flex', marginTop: '10px' }}>
          <div style={{ marginRight: '10px' }}>
            Already have an account?
          </div>
          <a href="/login">Login</a>
        </b>
      </form>
    </div>
  );
};

export default Register;
