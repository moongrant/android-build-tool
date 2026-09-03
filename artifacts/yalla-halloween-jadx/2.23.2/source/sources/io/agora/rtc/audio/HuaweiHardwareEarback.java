package io.agora.rtc.audio;

import android.content.Context;
import io.agora.rtc.internal.Logging;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes5.dex */
class HuaweiHardwareEarback implements IHardwareEarback {
    private static final String TAG = "HuaweiHardwareEarback";
    private Context mContext;
    private Object mHwAudioKit = null;
    private Object mHwAudioKaraokeFeatureKit = null;
    private boolean mInited = false;
    private boolean mEarbackEnabled = false;
    private int latency = 0;
    private int volume = 0;
    Class clsHwAudioKit = null;
    Class clsAudioKitCallback = null;
    Class clsHwAudioKaraokeFeatureKit = null;
    private boolean mClsInited = false;

    public HuaweiHardwareEarback(Context context) {
        this.mContext = null;
        Logging.d(TAG, ">>ctor");
        this.mContext = context;
        initialize();
    }

    public static boolean hasHwAudioKitClass() {
        return (ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback") == null || ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKit") == null || ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit") == null) ? false : true;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public void destroy() {
        Logging.d(TAG, ">>destroy");
        Object obj = this.mHwAudioKaraokeFeatureKit;
        if (obj != null) {
            ReflectUtils.safeCallMethod(this.clsHwAudioKaraokeFeatureKit, obj, "destroy", new Class[0], new Object[0]);
        }
        Object obj2 = this.mHwAudioKit;
        if (obj2 != null) {
            ReflectUtils.safeCallMethod(this.clsHwAudioKit, obj2, "destroy", new Class[0], new Object[0]);
        }
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public synchronized int enableEarbackFeature(boolean z) {
        if (this.mInited && this.mClsInited) {
            Logging.d(TAG, ">>enableEarbackFeature " + z);
            Object objSafeCallMethod = ReflectUtils.safeCallMethod(this.clsHwAudioKaraokeFeatureKit, this.mHwAudioKaraokeFeatureKit, "isKaraokeFeatureSupport", new Class[0], new Object[0]);
            if (objSafeCallMethod != null && objSafeCallMethod.getClass().equals(Boolean.class)) {
                if (!((Boolean) objSafeCallMethod).booleanValue()) {
                    Logging.e(TAG, "karaoke not supported");
                    return -1;
                }
                Object objSafeCallMethod2 = ReflectUtils.safeCallMethod(this.clsHwAudioKaraokeFeatureKit, this.mHwAudioKaraokeFeatureKit, "enableKaraokeFeature", new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(z)});
                if (objSafeCallMethod2 != null && objSafeCallMethod2.getClass().equals(Integer.class)) {
                    int iIntValue = ((Integer) objSafeCallMethod2).intValue();
                    if (iIntValue != 0) {
                        Logging.e(TAG, "enableKaraokeFeature failed ret " + iIntValue);
                        return -1;
                    }
                    this.mEarbackEnabled = z;
                    if (z) {
                        Object objSafeCallMethod3 = ReflectUtils.safeCallMethod(this.clsHwAudioKaraokeFeatureKit, this.mHwAudioKaraokeFeatureKit, "getKaraokeLatency", new Class[0], new Object[0]);
                        if (objSafeCallMethod3 == null || !objSafeCallMethod3.getClass().equals(Integer.class)) {
                            this.latency = ((Integer) objSafeCallMethod3).intValue();
                        }
                        Logging.i(TAG, "latency " + this.latency);
                    }
                    return 0;
                }
                return -1;
            }
            return -1;
        }
        return -7;
    }

    public void finalize() throws Throwable {
        Logging.d(TAG, ">>finalize");
        destroy();
        super.finalize();
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public void initialize() {
        Constructor constructor;
        if (this.mContext == null) {
            Logging.e(TAG, "mContext is null!");
            return;
        }
        Logging.d(TAG, ">>initialize");
        this.clsHwAudioKit = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKit");
        this.clsAudioKitCallback = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback");
        Class clsSafeFindClass = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit");
        this.clsHwAudioKaraokeFeatureKit = clsSafeFindClass;
        Class cls = this.clsAudioKitCallback;
        if (cls == null || this.clsHwAudioKit == null || clsSafeFindClass == null) {
            return;
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{this.clsAudioKitCallback}, new InvocationHandler() { // from class: io.agora.rtc.audio.HuaweiHardwareEarback.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (!method.getName().equals("onResult")) {
                    return null;
                }
                int iIntValue = ((Integer) objArr[0]).intValue();
                if (iIntValue == 0) {
                    Logging.i(HuaweiHardwareEarback.TAG, "IAudioKitCallback: HwAudioKit init success");
                    return null;
                }
                if (iIntValue == 2) {
                    Logging.i(HuaweiHardwareEarback.TAG, "IAudioKitCallback: audio kit not installed");
                    return null;
                }
                if (iIntValue == 1000) {
                    HuaweiHardwareEarback.this.mInited = true;
                    Logging.i(HuaweiHardwareEarback.TAG, "IAudioKitCallback: HwAudioKaraokeFeatureKit init success ");
                    return null;
                }
                Logging.e(HuaweiHardwareEarback.TAG, "IAudioKitCallback: onResult error number " + iIntValue);
                return null;
            }
        });
        Method method = null;
        try {
            constructor = this.clsHwAudioKit.getConstructor(Context.class, this.clsAudioKitCallback);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            constructor = null;
        }
        if (constructor == null) {
            Logging.e(TAG, "find HwAudioKit constructor failed");
            return;
        }
        try {
            this.mHwAudioKit = constructor.newInstance(this.mContext, objNewProxyInstance);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (this.mHwAudioKit == null) {
            Logging.e(TAG, "create HwAudioKit failed");
            return;
        }
        try {
            Method method2 = this.clsHwAudioKit.getMethod("initialize", new Class[0]);
            if (method2 != null) {
                method2.invoke(this.mHwAudioKit, new Object[0]);
            }
            Class<?> clsSafeFindClass2 = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKit$FeatureType");
            if (clsSafeFindClass2 == null) {
                Logging.e(TAG, "cannot find class  HwAudioKit$FeatureType initialize failed");
                return;
            }
            Object obj = clsSafeFindClass2.isEnum() ? clsSafeFindClass2.getEnumConstants()[0] : null;
            if (obj == null) {
                Logging.e(TAG, "cannot find class  HwAudioKit$FeatureType initialize failed");
                return;
            }
            try {
                method = this.clsHwAudioKit.getMethod("createFeature", clsSafeFindClass2);
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            }
            if (method == null) {
                Logging.e(TAG, "cannot find method createFeature ");
                return;
            }
            try {
                this.mHwAudioKaraokeFeatureKit = method.invoke(this.mHwAudioKit, obj);
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
            if (this.mHwAudioKaraokeFeatureKit == null) {
                Logging.e(TAG, " createFeature failed");
            } else {
                this.mClsInited = true;
            }
        } catch (IllegalAccessException e6) {
            e6.printStackTrace();
            Logging.e(TAG, "create HwAudioKit initialize failed");
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
            Logging.e(TAG, "create HwAudioKit initialize failed");
        } catch (InvocationTargetException e8) {
            e8.printStackTrace();
            Logging.e(TAG, "create HwAudioKit initialize failed");
        }
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public boolean isHardwareEarbackSupported() {
        boolean zBooleanValue = false;
        if (this.mInited && this.mClsInited) {
            Logging.d(TAG, ">>isHardwareEarbackSupported");
            try {
                zBooleanValue = ((Boolean) ReflectUtils.safeCallMethod(this.clsHwAudioKaraokeFeatureKit, this.mHwAudioKaraokeFeatureKit, "isKaraokeFeatureSupport", new Class[0], new Object[0])).booleanValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Logging.d(TAG, "isSupported " + zBooleanValue);
        }
        return zBooleanValue;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public synchronized int setHardwareEarbackVolume(int i) {
        int iIntValue;
        if (this.mInited && this.mClsInited) {
            Logging.d(TAG, ">>setHardwareEarbackVolume " + i);
            if (i < 0) {
                i = 0;
            } else if (i > 100) {
                i = 100;
            }
            Class clsSafeFindClass = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$ParameName");
            if (clsSafeFindClass == null) {
                Logging.e(TAG, "cannot find method  ParameName.getParameName");
                return -1;
            }
            Method methodSafeGetMethod = ReflectUtils.safeGetMethod(clsSafeFindClass, "getParameName", new Class[0]);
            if (methodSafeGetMethod == null) {
                Logging.e(TAG, "cannot find method  ParameName.getParameName");
                return -1;
            }
            Object obj = null;
            try {
                for (Object obj2 : clsSafeFindClass.getEnumConstants()) {
                    Object objInvoke = methodSafeGetMethod.invoke(obj2, new Object[0]);
                    if (objInvoke != null && ((String) objInvoke).equals("Karaoke_volume=")) {
                        obj = obj2;
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
            if (obj == null) {
                Logging.e(TAG, "cannot find object  ParameName.CMD_SET_VOCAL_VOLUME_BASE");
                return -1;
            }
            try {
                iIntValue = ((Integer) ReflectUtils.safeCallMethod(this.clsHwAudioKaraokeFeatureKit, this.mHwAudioKaraokeFeatureKit, "setParameter", new Class[]{clsSafeFindClass, Integer.TYPE}, new Object[]{obj, Integer.valueOf(i)})).intValue();
            } catch (Exception e3) {
                e3.printStackTrace();
                iIntValue = -1;
            }
            if (iIntValue == 0) {
                this.volume = i;
                return 0;
            }
            Logging.e(TAG, "setParameter error number " + iIntValue);
            return -1;
        }
        return -7;
    }
}
