package o0OO00OO;

import o00O0OOO.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO extends Oooo000 {
    @Override // o00O0OOO.Oooo000
    public final int OooO0OO(StringBuilder sb, char c) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        }
        if (c >= 'a' && c <= 'z') {
            sb.append((char) ((c - 'a') + 14));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        }
        if (c == '`') {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) 2);
            sb.append((char) ((c - 'A') + 1));
            return 2;
        }
        if (c < '{' || c > 127) {
            sb.append("\u0001\u001e");
            return OooO0OO(sb, (char) (c - 128)) + 2;
        }
        sb.append((char) 2);
        sb.append((char) ((c - '{') + 27));
        return 2;
    }

    @Override // o00O0OOO.Oooo000
    public final int OooO0Oo() {
        return 2;
    }
}
