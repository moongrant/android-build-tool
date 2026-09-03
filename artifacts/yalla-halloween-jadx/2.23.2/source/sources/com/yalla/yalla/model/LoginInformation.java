package com.yalla.yalla.model;

import com.yalla.yalla.model.user.UserInfoApiModel;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LoginInformation {
    public String code;
    public List<UserInfoApiModel> data;
    public boolean isFirst;
    public String message;
    public LoginToken token;

    public static class LoginToken {
        private String token;
        private String token_activity;
        private String token_chat;
        private String token_room;

        public String getToken() {
            String str = this.token;
            return str == null ? "" : str;
        }

        public String getTokenActivity() {
            String str = this.token_activity;
            return str == null ? "" : str;
        }

        public String getTokenChat() {
            String str = this.token_chat;
            return str == null ? "" : str;
        }

        public String getTokenRoom() {
            String str = this.token_room;
            return str == null ? "" : str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setTokenActivity(String str) {
            this.token_activity = str;
        }

        public void setTokenChat(String str) {
            this.token_chat = str;
        }

        public void setTokenRoom(String str) {
            this.token_room = str;
        }
    }
}
