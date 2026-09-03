package io.agora.rtc.audio;

import android.content.Context;
import io.agora.rtc.internal.Logging;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes5.dex */
public class OppoHardwareEarback implements IHardwareEarback {
    private static String TAG = "AG-OPPO";
    private Class clsMediaClient;
    private Class clsMediaUnit;
    private Class clsOnConnectionSucceedListener;
    private boolean isConnected = false;
    private boolean mClsInited = false;
    private Context mContext;

    public OppoHardwareEarback(Context context) {
        this.mContext = context;
        initialize();
    }

    public static boolean hasMediaUnitClass() {
        return (ReflectUtils.safeFindClass("com.coloros.ocs.mediaunit.MediaUnitClient") == null || ReflectUtils.safeFindClass("com.coloros.ocs.mediaunit.MediaUnit") == null || ReflectUtils.safeFindClass("com.coloros.ocs.base.common.api.OnConnectionSucceedListener") == null) ? false : true;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public void destroy() {
        Object objSafeCallMethod;
        if (this.mClsInited) {
            try {
                Context context = this.mContext;
                if (context == null || (objSafeCallMethod = ReflectUtils.safeCallMethod(this.clsMediaUnit, null, "getMediaClient", new Class[]{Context.class}, new Object[]{context})) == null) {
                    return;
                }
                ReflectUtils.safeCallMethod(this.clsMediaClient, objSafeCallMethod, "release", new Class[0], new Object[0]);
            } catch (Exception e) {
                Logging.e(e.getMessage());
            }
        }
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public int enableEarbackFeature(boolean z) {
        if (!this.mClsInited) {
            return -1;
        }
        try {
            Context context = this.mContext;
            if (context != null && this.isConnected) {
                final Object objSafeCallMethod = ReflectUtils.safeCallMethod(this.clsMediaUnit, null, "getMediaClient", new Class[]{Context.class}, new Object[]{context});
                if (z) {
                    if (objSafeCallMethod != null) {
                        ReflectUtils.safeCallMethod(this.clsMediaClient, objSafeCallMethod, "addOnConnectionSucceedListener", new Class[]{this.clsOnConnectionSucceedListener}, new Object[]{Proxy.newProxyInstance(this.clsOnConnectionSucceedListener.getClassLoader(), new Class[]{this.clsOnConnectionSucceedListener}, new InvocationHandler() { // from class: io.agora.rtc.audio.OppoHardwareEarback.2
                            @Override // java.lang.reflect.InvocationHandler
                            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                                if (!method.getName().equals("onConnectionSucceed") || OppoHardwareEarback.this.mContext == null) {
                                    return null;
                                }
                                ReflectUtils.safeCallMethod(OppoHardwareEarback.this.clsMediaClient, objSafeCallMethod, "requestAudioLoopback", new Class[0], new Object[0]);
                                return null;
                            }
                        })});
                    }
                } else if (objSafeCallMethod != null) {
                    ReflectUtils.safeCallMethod(this.clsMediaClient, objSafeCallMethod, "addOnConnectionSucceedListener", new Class[]{this.clsOnConnectionSucceedListener}, new Object[]{Proxy.newProxyInstance(this.clsOnConnectionSucceedListener.getClassLoader(), new Class[]{this.clsOnConnectionSucceedListener}, new InvocationHandler() { // from class: io.agora.rtc.audio.OppoHardwareEarback.3
                        @Override // java.lang.reflect.InvocationHandler
                        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                            if (!method.getName().equals("onConnectionSucceed") || OppoHardwareEarback.this.mContext == null) {
                                return null;
                            }
                            ReflectUtils.safeCallMethod(OppoHardwareEarback.this.clsMediaClient, objSafeCallMethod, "abandonAudioLoopback", new Class[0], new Object[0]);
                            return null;
                        }
                    })});
                }
                return 0;
            }
        } catch (Exception e) {
            Logging.e(e.getMessage());
        }
        return -1;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public void initialize() {
        Class cls;
        Object objSafeCallMethod;
        this.clsMediaUnit = ReflectUtils.safeFindClass("com.coloros.ocs.mediaunit.MediaUnit");
        this.clsMediaClient = ReflectUtils.safeFindClass("com.coloros.ocs.mediaunit.MediaUnitClient");
        Class clsSafeFindClass = ReflectUtils.safeFindClass("com.coloros.ocs.base.common.api.OnConnectionSucceedListener");
        this.clsOnConnectionSucceedListener = clsSafeFindClass;
        if (this.clsMediaClient == null || (cls = this.clsMediaUnit) == null || clsSafeFindClass == null) {
            return;
        }
        this.mClsInited = true;
        try {
            Context context = this.mContext;
            if (context == null || (objSafeCallMethod = ReflectUtils.safeCallMethod(cls, null, "getMediaClient", new Class[]{Context.class}, new Object[]{context})) == null) {
                return;
            }
            ReflectUtils.safeCallMethod(this.clsMediaClient, objSafeCallMethod, "addOnConnectionSucceedListener", new Class[]{this.clsOnConnectionSucceedListener}, new Object[]{Proxy.newProxyInstance(this.clsOnConnectionSucceedListener.getClassLoader(), new Class[]{this.clsOnConnectionSucceedListener}, new InvocationHandler() { // from class: io.agora.rtc.audio.OppoHardwareEarback.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    if (!method.getName().equals("onConnectionSucceed")) {
                        return null;
                    }
                    OppoHardwareEarback.this.isConnected = true;
                    return null;
                }
            })});
        } catch (Exception e) {
            Logging.e(e.getMessage());
        }
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public boolean isHardwareEarbackSupported() {
        return this.isConnected && this.mClsInited;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public int setHardwareEarbackVolume(int i) {
        return 0;
    }
}
