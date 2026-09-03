package org.cocos2dx.lib;

import OooO0o.OooO0o;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class Cocos2dxReflectionHelper {
    public static <T> T getConstantValue(Class cls, String str) {
        try {
            return (T) cls.getDeclaredField(str).get(null);
        } catch (IllegalAccessException unused) {
            Log.e("error", str + " is not accessible");
            return null;
        } catch (IllegalArgumentException unused2) {
            Log.e("error", "arguments error when get " + str);
            return null;
        } catch (NoSuchFieldException unused3) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("can not find ", str, " in ");
            sbOooO0OO.append(cls.getName());
            Log.e("error", sbOooO0OO.toString());
            return null;
        } catch (Exception unused4) {
            Log.e("error", "can not get constant" + str);
            return null;
        }
    }

    public static <T> T invokeInstanceMethod(Object obj, String str, Class[] clsArr, Object[] objArr) {
        Class<?> cls = obj.getClass();
        try {
            return (T) cls.getMethod(str, clsArr).invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            Log.e("error", str + " is not accessible");
            return null;
        } catch (IllegalArgumentException unused2) {
            Log.e("error", "arguments are error when invoking " + str);
            return null;
        } catch (NoSuchMethodException unused3) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("can not find ", str, " in ");
            sbOooO0OO.append(cls.getName());
            Log.e("error", sbOooO0OO.toString());
            return null;
        } catch (InvocationTargetException unused4) {
            Log.e("error", "an exception was thrown by the invoked method when invoking " + str);
            return null;
        }
    }
}
