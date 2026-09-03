package p546o0o0OoOO;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.model.RoomItemInfoModel;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p161o00OoOO0.o00OO0OO;
import p390o0OOooO.o00000O0;
import p499o0o00Oo.OooOOO0;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class h6 extends o00OO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f44259OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f44260OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ boolean f44261OooO0OO;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<Boolean>> {
    }

    public h6(RoomSettingActivity roomSettingActivity, int i, boolean z) {
        this.f44259OooO00o = roomSettingActivity;
        this.f44260OooO0O0 = i;
        this.f44261OooO0OO = z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        Object objOooO0OO = o0Oo0oo.OooO0OO(response, new OooO00o().getType());
        Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(response, objec…vaBeanApi<Boolean>>() {})");
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) objOooO0OO;
        OooOOO0 oooOOO0 = OooOOO0.f41199OooO00o;
        if (!OooOOO0.OooO0o0().OooOO0O()) {
            OooOOO0.OooO0o0().OooOOO();
            o00OO000 o00oo001 = o00OO000.f43171OooO00o;
            o00OO000.f43221o000oOoO.setValue(Boolean.FALSE);
        }
        o00OO0O0.f43338OooooOo.OooO00o().f43377Oooo0OO.postValue(absJavaBeanApi.data);
        RoomSettingActivity roomSettingActivity = this.f44259OooO00o;
        RoomSettingActivity.OooO00o oooO00o = RoomSettingActivity.f22988oo000o;
        RoomItemInfoModel item = roomSettingActivity.OooOoo().getItem(this.f44260OooO0O0);
        if (item != null) {
            item.setTurnOnSwitch(Boolean.valueOf(!this.f44261OooO0OO));
        }
        this.f44259OooO00o.OooOoo().notifyItemChanged(this.f44260OooO0O0);
    }
}
