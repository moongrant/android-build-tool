package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 {
    public static String OooO00o(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte bOooO00o = byteString.OooO00o(i);
            if (bOooO00o == 34) {
                sb.append("\\\"");
            } else if (bOooO00o == 39) {
                sb.append("\\'");
            } else if (bOooO00o != 92) {
                switch (bOooO00o) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bOooO00o < 32 || bOooO00o > 126) {
                            sb.append('\\');
                            sb.append((char) (((bOooO00o >>> 6) & 3) + 48));
                            sb.append((char) (((bOooO00o >>> 3) & 7) + 48));
                            sb.append((char) ((bOooO00o & 7) + 48));
                        } else {
                            sb.append((char) bOooO00o);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
