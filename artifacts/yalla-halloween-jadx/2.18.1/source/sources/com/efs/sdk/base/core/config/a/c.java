package com.efs.sdk.base.core.config.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.core.c.f;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Handler.Callback {
    public static final Random a = new Random();
    public IConfigRefreshAction b;
    public boolean c;
    public b d;
    public Map<IConfigCallback, String[]> e;
    private Handler f;
    private e g;
    private long h;

    public static class a {
        private static final c a = new c(0);
    }

    public /* synthetic */ c(byte b) {
        this();
    }

    private void e() {
        if (!f.a.a.a()) {
            com.efs.sdk.base.core.util.d.a("efs.config", "has no permission to refresh config from remote");
            return;
        }
        if (!this.c) {
            com.efs.sdk.base.core.util.d.a("efs.config", "disable refresh config from remote");
            return;
        }
        String strRefresh = g().refresh();
        com.efs.sdk.base.core.util.d.a("efs.config", "efs config is ".concat(String.valueOf(strRefresh)));
        if (TextUtils.isEmpty(strRefresh)) {
            return;
        }
        a(strRefresh);
    }

    private void f() {
        boolean zA;
        try {
            zA = this.g.a(this.d);
        } catch (Throwable unused) {
            zA = false;
        }
        if (zA) {
            return;
        }
        this.f.sendEmptyMessageDelayed(3, 3000L);
    }

    @NonNull
    private IConfigRefreshAction g() {
        IConfigRefreshAction iConfigRefreshAction = this.b;
        return iConfigRefreshAction == null ? com.efs.sdk.base.core.config.a.a.a() : iConfigRefreshAction;
    }

    private boolean h() {
        e.b();
        long j = 0;
        try {
            e eVar = this.g;
            eVar.c();
            if (eVar.a != null) {
                j = eVar.a.getLong("last_refresh_time", 0L);
            }
        } catch (Throwable unused) {
        }
        return System.currentTimeMillis() - j >= 28800000;
    }

    private void i() {
        try {
            for (ValueCallback<Pair<Message, Message>> valueCallback : ControllerCenter.getGlobalEnvStruct().getCallback(1)) {
                Message messageObtain = Message.obtain(null, 1, new JSONObject(this.d.e).toString());
                Message messageObtain2 = Message.obtain();
                valueCallback.onReceiveValue(new Pair<>(messageObtain, messageObtain2));
                messageObtain.recycle();
                messageObtain2.recycle();
            }
            Iterator<IEfsReporterObserver> it = ControllerCenter.getGlobalEnvStruct().getEfsReporterObservers().iterator();
            while (it.hasNext()) {
                it.next().onConfigChange();
            }
        } catch (Throwable th) {
            com.efs.sdk.base.core.util.d.b("efs.base", "efs.config", th);
        }
    }

    public final Map<String, String> c() {
        return new HashMap(this.d.e);
    }

    public final void d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.efs.sdk.base.core.config.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : c.this.e.keySet()) {
                        String[] strArr = (String[]) c.this.e.get(iConfigCallback);
                        HashMap map = new HashMap();
                        if (strArr != null && strArr.length != 0) {
                            for (String str : strArr) {
                                if (c.this.d.e.containsKey(str)) {
                                    map.put(str, c.this.c().get(str));
                                    com.efs.sdk.base.core.util.d.a("efs.config", "--->>> configCallback key is " + str + " ## value is " + c.this.c().get(str));
                                }
                            }
                        }
                        iConfigCallback.onChange(map);
                    }
                    c.this.e.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        b bVar;
        String str;
        int i = message.what;
        if (i == 0) {
            boolean zA = e.a();
            com.efs.sdk.base.core.util.d.a("efs.config", "--->>> 删除旧的配置文件 ".concat(String.valueOf(zA)));
            if (zA) {
                this.f.sendEmptyMessage(1);
            } else {
                e eVar = this.g;
                eVar.c();
                if (eVar.a == null) {
                    bVar = null;
                } else {
                    b bVarA = b.a();
                    bVarA.a = eVar.a.getInt("cver", -1);
                    Set<String> setKeySet = eVar.a.getAll().keySet();
                    HashMap map = new HashMap();
                    for (String str2 : setKeySet) {
                        String string = eVar.a.getString(str2, "");
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    bVarA.a(map);
                    bVar = bVarA;
                }
                if (bVar == null) {
                    com.efs.sdk.base.core.util.d.a("efs.config", "--->>> 首次启动本地无配置或加载失败 ");
                } else if (a(bVar)) {
                    com.efs.sdk.base.core.util.d.a("efs.config", "--->>> 一致 ");
                } else {
                    this.d = bVar;
                    if (-1 != bVar.a) {
                        i();
                        d();
                        str = "load config from storage and notify observer";
                    } else {
                        str = "load config from storage";
                    }
                    com.efs.sdk.base.core.util.d.a("efs.config", str);
                }
            }
        } else if (i == 1) {
            int i2 = message.arg1;
            if (i2 <= this.d.a) {
                com.efs.sdk.base.core.util.d.a("efs.config", "current config version is " + i2 + ", no need to refresh");
                com.efs.sdk.base.core.util.d.a("efs.config", "current config version(" + this.d.a + ") is " + i2 + ", no need to refresh");
            } else {
                e();
            }
        } else if (i != 2) {
            if (i == 3) {
                f();
            }
        } else if (f.a.a.a()) {
            if (h()) {
                e();
            } else {
                com.efs.sdk.base.core.util.d.a("efs.config", "No update is required, less than 8h since the last update");
            }
        }
        return true;
    }

    private c() {
        this.c = true;
        this.e = new HashMap();
        this.f = new Handler(com.efs.sdk.base.core.util.a.a.a.getLooper(), this);
        this.g = new e();
        this.d = b.a();
        this.h = ControllerCenter.getGlobalEnvStruct().configRefreshDelayMills;
    }

    public static c a() {
        return a.a;
    }

    public final void b() {
        this.f.sendEmptyMessage(0);
        this.f.sendEmptyMessageDelayed(2, this.h);
    }

    public final void a(int i) {
        if (i <= this.d.a) {
            com.efs.sdk.base.core.util.d.a("efs.config", "current config version is " + i + ", no need to refresh");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = i;
        messageObtain.what = 1;
        this.f.sendMessage(messageObtain);
    }

    public final String a(boolean z) {
        if (z) {
            return "https://" + this.d.c;
        }
        return this.d.b + this.d.c;
    }

    public final void a(String str) {
        b bVarA = b.a();
        if (d.a(str, bVarA)) {
            if (a(bVarA)) {
                return;
            }
            this.d = bVarA;
            f();
            i();
            d();
            return;
        }
        this.f.sendEmptyMessageDelayed(1, 3000L);
    }

    private boolean a(b bVar) {
        if (this.d.a >= bVar.a) {
            return true;
        }
        com.efs.sdk.base.core.util.d.a("efs.config", "current config version (" + this.d.a + ") is older than another (" + bVar.a + ")");
        return false;
    }
}
