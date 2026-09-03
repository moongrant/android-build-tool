package p580o0oOoOo;

import android.net.Uri;
import android.os.Looper;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.selectPicture.model.SelectImageData;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p159o00OoOO.o000O00O;
import p162o00OoOOo.o0O0o;
import p162o00OoOOo.o0OoOoOo;
import p193o00o0O00.Oooo0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;
import p606o0oo0O.OooOo;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0OoO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f46679Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OoO0(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f46679Oooo0o = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOo.OooO0O0("102225");
        o00O o00o2 = o00O.f43140OooO00o;
        o00O.f43155OooOOo.setValue(Boolean.FALSE);
        MixedRoomActivity mixedRoomActivity = this.f46679Oooo0o;
        final o0OoOoOo o0oooooo2 = new o0OoOoOo(mixedRoomActivity);
        o0O00000.OooO0OO("InRoom_photo");
        try {
            if (OooOOO.f41216OooO00o.OooOO0().getValue().intValue() >= 5) {
                o0O0O00.OooO0OO(mixedRoomActivity, oo0o0Oo.f48607OooO0O0, o0O0o.f32505Oooo0o, new Function1() { // from class: o00OoOOo.o0O0000O
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final o0OoOoOo o0oooooo3 = o0oooooo2;
                        Objects.requireNonNull(o0oooooo3);
                        if (((Boolean) obj).booleanValue()) {
                            Oooo0.f33130OooO00o.OooO0OO(o0oooooo3.f32506OooO00o, true, new Function1() { // from class: o00OoOOo.o0O000
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Uri uri;
                                    SelectImageData selectImageData = (SelectImageData) obj2;
                                    Objects.requireNonNull(o0oooooo3);
                                    if (selectImageData != null && (uri = selectImageData.OooO0O0()) != null && !OooO0OO.OooO00o(uri) && o000O00O.OooO().f32427Oooo != null) {
                                        o0O000O listener = new o0O000O();
                                        Intrinsics.checkNotNullParameter(uri, "uri");
                                        Intrinsics.checkNotNullParameter(listener, "listener");
                                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O000Oo(uri, listener, null), 3, null);
                                    }
                                    return null;
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                });
            } else {
                String strOooO0OO = o000O0O0.OooO0OO(R.string.send_img_toast);
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o0O0ooO runnable = new o0O0ooO(toastUtil, strOooO0OO);
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable.run();
                    } else {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(runnable);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            String strOooO0OO2 = o000O0O0.OooO0OO(R.string.send_img_toast);
            ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o002 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
