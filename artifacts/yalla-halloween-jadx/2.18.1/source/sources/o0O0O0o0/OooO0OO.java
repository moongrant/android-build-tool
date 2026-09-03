package o0O0O0o0;

import android.util.Log;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.efs.sdk.base.Constants;
import com.google.android.exoplayer2.OooOOO0;
import com.google.firebase.encoders.EncodingException;
import com.qiniu.android.http.request.Request;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.moment.MomentEditRecordActivity;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicAddMoreFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import p285o0O0O0o.Oooo0;
import p285o0O0O0o.o00Oo0;
import p354o0OOOo.OooOO0;
import p375o0OOo0oo.o0OOO0o;
import p375o0OOo0oo.o0ooOOo;
import p406o0Oo0OOO.o0oo0000;
import p406o0Oo0OOO.oO00000;
import p406o0Oo0OOO.oO00000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements OooOOO0.OooO, o0ooOOo.OooO00o, androidx.activity.result.OooO00o, p186o00o00Oo.o0ooOOo, BaseQuickAdapter.OooOOOO, BaseQuickAdapter.OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f35424OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f35425OooO0o0;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f35424OooO0Oo = i;
        this.f35425OooO0o0 = obj;
    }

    public final Object OooO00o(Object obj) throws IOException {
        OooO0o oooO0o = (OooO0o) this.f35425OooO0o0;
        OooO0o.OooO00o oooO00o = (OooO0o.OooO00o) obj;
        Objects.requireNonNull(oooO0o);
        o0O0OO.OooO00o.OooO0o0("Making request to: %s", oooO00o.f35433OooO00o);
        HttpURLConnection httpURLConnection = (HttpURLConnection) oooO00o.f35433OooO00o.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(oooO0o.f35432OooO0oO);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(Request.HttpMethodPOST);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.7"));
        httpURLConnection.setRequestProperty("Content-Encoding", Constants.CP_GZIP);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", Constants.CP_GZIP);
        String str = oooO00o.f35435OooO0OO;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    oooO0o.f35426OooO00o.OooO00o(oooO00o.f35434OooO0O0, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    o0O0OO.OooO00o.OooO0o0("Status Code: %d", Integer.valueOf(responseCode));
                    o0O0OO.OooO00o.OooO00o("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    o0O0OO.OooO00o.OooO00o("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new OooO0o.OooO0O0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new OooO0o.OooO0O0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = Constants.CP_GZIP.equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            OooO0o.OooO0O0 oooO0O0 = new OooO0o.OooO0O0(responseCode, null, ((Oooo0) o00Oo0.OooO00o(new BufferedReader(new InputStreamReader(gZIPInputStream)))).f35410OooO00o);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return oooO0O0;
                        } catch (Throwable th) {
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (EncodingException e) {
            e = e;
            o0O0OO.OooO00o.OooO0OO("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new OooO0o.OooO0O0(ShopVehicleListModel.VehicleTagType_Vip400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            o0O0OO.OooO00o.OooO0OO("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new OooO0o.OooO0O0(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            o0O0OO.OooO00o.OooO0OO("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new OooO0o.OooO0O0(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            o0O0OO.OooO00o.OooO0OO("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new OooO0o.OooO0O0(ShopVehicleListModel.VehicleTagType_Vip400, null, 0L);
        }
    }

    @Override // o0OOo0oo.o0ooOOo.OooO00o
    public final void OooO0O0(o0OOO0o o0ooo0o2) {
        p354o0OOOo.OooOOO0 oooOOO0 = (p354o0OOOo.OooOOO0) this.f35425OooO0o0;
        Objects.requireNonNull(oooOOO0);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        oooOOO0.f38302OooO0O0.set((OooOO0) o0ooo0o2.get());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        MainRoomMineJoinedFragment.m472initView$lambda3((MainRoomMineJoinedFragment) this.f35425OooO0o0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MainMomentsTopicAddMoreFragment.m347initView$lambda5((MainMomentsTopicAddMoreFragment) this.f35425OooO0o0, baseQuickAdapter, view, i);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f35424OooO0Oo) {
            case 5:
                MomentEditRecordActivity this$0 = (MomentEditRecordActivity) this.f35425OooO0o0;
                MomentEditRecordActivity.OooO00o oooO00o = MomentEditRecordActivity.f22315OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.Oooo00O(false);
                break;
            default:
                BanEnterRoomListActivity this$1 = (BanEnterRoomListActivity) this.f35425OooO0o0;
                int i = BanEnterRoomListActivity.f22745o00O0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!this$1.f22756OoooooO) {
                    this$1.OooOoo0();
                } else {
                    this$1.OooOoo(this$1.f22758o0OoOo0, true);
                }
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        oO00000 this$0 = (oO00000) this.f35425OooO0o0;
        Boolean granted = (Boolean) obj;
        int i = oO00000.f39104OoooOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(granted, "granted");
        boolean zBooleanValue = granted.booleanValue();
        if (this$0.OooO00o()) {
            o0oo0000 o0oo0000Var = null;
            if (zBooleanValue) {
                oO00000o oo00000o = this$0.f39106Oooo0o;
                if (oo00000o == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pb");
                    oo00000o = null;
                }
                oo00000o.f39120OooO0oO.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                oO00000o oo00000o2 = this$0.f39106Oooo0o;
                if (oo00000o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pb");
                    oo00000o2 = null;
                }
                oo00000o2.f39121OooO0oo.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                oO00000o oo00000o3 = this$0.f39106Oooo0o;
                if (oo00000o3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pb");
                    oo00000o3 = null;
                }
                oo00000o3.f39113OooO.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                o0oo0000 o0oo0000Var2 = this$0.f39107Oooo0oO;
                if (o0oo0000Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0000Var = o0oo0000Var2;
                }
                o0oo0000Var.OooO0O0();
                return;
            }
            this$0.shouldShowRequestPermissionRationale("android.permission.ACCESS_BACKGROUND_LOCATION");
            oO00000o oo00000o4 = this$0.f39106Oooo0o;
            if (oo00000o4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o4 = null;
            }
            Objects.requireNonNull(oo00000o4);
            oO00000o oo00000o5 = this$0.f39106Oooo0o;
            if (oo00000o5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o5 = null;
            }
            Objects.requireNonNull(oo00000o5);
            oO00000o oo00000o6 = this$0.f39106Oooo0o;
            if (oo00000o6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo00000o6 = null;
            }
            Objects.requireNonNull(oo00000o6);
            o0oo0000 o0oo0000Var3 = this$0.f39107Oooo0oO;
            if (o0oo0000Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
            } else {
                o0oo0000Var = o0oo0000Var3;
            }
            o0oo0000Var.OooO0O0();
        }
    }
}
