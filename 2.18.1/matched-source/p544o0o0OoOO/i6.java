package p544o0o0OoOO;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.model.RoomItemInfoModel;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p497o0o00Oo.OooOOO0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class i6 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f44250OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f44251OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ boolean f44252OooO0OO;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<Boolean>> {
    }

    public i6(RoomSettingActivity roomSettingActivity, int i, boolean z) {
        this.f44250OooO00o = roomSettingActivity;
        this.f44251OooO0O0 = i;
        this.f44252OooO0OO = z;
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
    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        Object objOooO0OO = o0Oo0oo.OooO0OO(response, new OooO00o().getType());
        Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(response, objec…vaBeanApi<Boolean>>() {})");
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) objOooO0OO;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        if (!OooOOO0.OooO0o0().OooOO0O()) {
            OooOOO0.OooO0o0().OooOOO();
            o00O o00o2 = o00O.f43140OooO00o;
            o00O.f43192o000oOoO.setValue(Boolean.FALSE);
        }
        o00OO00O.f43313OooooOo.OooO00o().f43352Oooo0OO.postValue(absJavaBeanApi.data);
        RoomSettingActivity roomSettingActivity = this.f44250OooO00o;
        RoomSettingActivity.OooO00o oooO00o = RoomSettingActivity.f22969o00Ooo;
        RoomItemInfoModel item = roomSettingActivity.OooOoo().getItem(this.f44251OooO0O0);
        if (item != null) {
            item.setTurnOnSwitch(Boolean.valueOf(!this.f44252OooO0OO));
        }
        this.f44250OooO00o.OooOoo().notifyItemChanged(this.f44251OooO0O0);
    }
}
