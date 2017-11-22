package services;

import dao.TokenDao;

public class TokenService implements TokenServiceInterface {

    TokenDao tokenDao = null;

    public TokenService() {
        tokenDao = new TokenDao();
    }

    public void addToken(int id, String token) {
        tokenDao.addToken(id,token);
    }

    public void updateToken(int id, String token) {
        tokenDao.updateToken(id,token);
    }

    public void deleteToken(String token) {
        tokenDao.deleteToken(token);
    }
    //return id user
    public int findToken(String token) {
        return tokenDao.findToken(token);
    }

}