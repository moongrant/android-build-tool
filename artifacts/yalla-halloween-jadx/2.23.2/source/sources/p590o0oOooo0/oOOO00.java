package p590o0oOooo0;

import com.code.android.json.OooO00o;
import java.lang.reflect.Type;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class oOOO00 {
    public static <T> T OooO00o(String str, Class<T> cls) {
        try {
            return (T) OooO00o.OooO00o().OooO0OO(str, cls);
        } catch (Exception e) {
            e.printStackTrace();
            o0000O00.OooO0Oo("GsonConvert fromJson\n json = " + str + "\n classOfT = " + cls + "\n Exception = " + e);
            return null;
        }
    }

    public static <T> T OooO0O0(String str, Type type) {
        try {
            return (T) OooO00o.OooO00o().OooO0Oo(str, type);
        } catch (Exception e) {
            e.printStackTrace();
            o0000O00.OooO0Oo("GsonConvert fromJson\n Exception = " + e + "\n json = " + str + "\n type = " + type);
            return null;
        }
    }

    public static String OooO0OO(Object obj) {
        return OooO00o.OooO00o().OooO0oo(obj);
    }
}
