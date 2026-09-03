package o0O000O;

import android.content.Context;
import com.qiniu.android.http.ResponseInfo;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p277o0O000o.OooOOO0;
import p451o0OoOoOO.o0OO;
import p451o0OoOoOO.o0OO0O0;
import p451o0OoOoOO.o0OO0o;
import p451o0OoOoOO.o0OO0o00;
import p451o0OoOoOO.o0OO0oO0;
import p451o0OoOoOO.o0OOO0;
import p451o0OoOoOO.o0OOO0OO;
import p451o0OoOoOO.o0OOooO0;
import p452o0OoOoOo.o;
import p452o0OoOoOo.o0OOOO0o;
import p452o0OoOoOo.o0OOo000;
import p452o0OoOoOo.o0o0000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0<IN, OUT> implements o0O000O.OooO00o<IN> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public o0OO0O0 f35081OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OOOO0o.OooO00o f35082OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OO0oO0 f35083OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public String f35084OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooO0O0<IN, OUT>.OooO00o f35085OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o0OOOO0o f35086OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public OooOOO0<IN> f35087OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public o0O000o0.OooO0O0<OUT> f35088OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public o0o0000<IN> f35089OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f35090OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public CopyOnWriteArraySet<o0O000O.OooO00o.OooO0O0> f35091OooOO0o;

    public final class OooO00o extends o0OOo000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public AtomicBoolean f35092OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<IN, OUT> f35093OooO0O0;

        public OooO00o(OooO0O0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f35093OooO0O0 = this$0;
            this.f35092OooO00o = new AtomicBoolean(false);
        }

        @Override // p452o0OoOoOo.o0OOo000
        public final void OooO00o(@NotNull o0OOOO0o connection, int i, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(reason, "reason");
            String str = this.f35093OooO0O0.f35084OooO0Oo;
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("LongLink: onClosed. { instance: ");
            sbOooO0O0.append(connection.hashCode());
            sbOooO0O0.append(", state: ");
            sbOooO0O0.append(this.f35093OooO0O0.f35090OooOO0O);
            sbOooO0O0.append(", code: ");
            sbOooO0O0.append(i);
            sbOooO0O0.append(", reason: ");
            sbOooO0O0.append(reason);
            sbOooO0O0.append(", isClosed: ");
            sbOooO0O0.append(this.f35092OooO00o);
            sbOooO0O0.append(" }");
            o0O000Oo.OooO00o.OooO00o(str, sbOooO0O0.toString());
            if (this.f35092OooO00o.get()) {
                return;
            }
            OooO0O0<IN, OUT> oooO0O0 = this.f35093OooO0O0;
            synchronized (oooO0O0) {
                oooO0O0.f35090OooOO0O = 3;
                Unit unit = Unit.INSTANCE;
            }
            OooO0O0<IN, OUT> oooO0O1 = this.f35093OooO0O0;
            for (o0O000O.OooO00o.OooO0O0 oooO0O2 : oooO0O1.f35091OooOO0o) {
                oooO0O1.f35081OooO.stop();
                oooO0O2.OooO0OO(i, reason);
                oooO0O1.f35089OooOO0.OooO0Oo(connection, i);
            }
        }

        @Override // p452o0OoOoOo.o0OOo000
        public final void OooO0O0(@NotNull o0OOOO0o connection, int i, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(reason, "reason");
            String str = this.f35093OooO0O0.f35084OooO0Oo;
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("LongLink: onClosing. { instance: ");
            sbOooO0O0.append(connection.hashCode());
            sbOooO0O0.append(", state: ");
            sbOooO0O0.append(this.f35093OooO0O0.f35090OooOO0O);
            sbOooO0O0.append(", code: ");
            sbOooO0O0.append(i);
            sbOooO0O0.append(", reason: ");
            sbOooO0O0.append(reason);
            sbOooO0O0.append(" }");
            o0O000Oo.OooO00o.OooO00o(str, sbOooO0O0.toString());
        }

        @Override // p452o0OoOoOo.o0OOo000
        public final void OooO0OO(@NotNull o0OOOO0o connection, @NotNull Throwable t, @Nullable String str) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(t, "t");
            String str2 = this.f35093OooO0O0.f35084OooO0Oo;
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("LongLink: onFailure. { instance: ");
            sbOooO0O0.append(connection.hashCode());
            sbOooO0O0.append(", state: ");
            sbOooO0O0.append(this.f35093OooO0O0.f35090OooOO0O);
            sbOooO0O0.append(", exception: ");
            sbOooO0O0.append(t);
            sbOooO0O0.append(", isClose: ");
            sbOooO0O0.append(this.f35092OooO00o);
            sbOooO0O0.append('}');
            o0O000Oo.OooO00o.OooO00o(str2, sbOooO0O0.toString());
            if (this.f35092OooO00o.get()) {
                return;
            }
            OooO0O0<IN, OUT> oooO0O0 = this.f35093OooO0O0;
            synchronized (oooO0O0) {
                oooO0O0.f35090OooOO0O = 3;
                Unit unit = Unit.INSTANCE;
            }
            if (str == null) {
                str = "";
            }
            OooO0O0<IN, OUT> oooO0O1 = this.f35093OooO0O0;
            for (o0O000O.OooO00o.OooO0O0 oooO0O2 : oooO0O1.f35091OooOO0o) {
                oooO0O1.f35081OooO.stop();
                oooO0O2.OooO0OO(ResponseInfo.TimedOut, str);
                oooO0O2.OooO0o0(t, ResponseInfo.TimedOut, str);
                oooO0O1.f35089OooOO0.OooO0Oo(connection, ResponseInfo.TimedOut);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p452o0OoOoOo.o0OOo000
        public final void OooO0Oo(@NotNull o0OOOO0o connection, @NotNull String text) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(text, "text");
            OooO0O0<IN, OUT> oooO0O0 = this.f35093OooO0O0;
            if (oooO0O0.f35090OooOO0O != 2) {
                String str = oooO0O0.f35084OooO0Oo;
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("LongLink: onMessage. { instance: ");
                sbOooO0O0.append(connection.hashCode());
                sbOooO0O0.append(", Text Message: ");
                sbOooO0O0.append(text);
                sbOooO0O0.append(", isClose: ");
                sbOooO0O0.append(this.f35092OooO00o);
                sbOooO0O0.append(" }");
                o0O000Oo.OooO00o.OooO00o(str, sbOooO0O0.toString());
            } else {
                String str2 = oooO0O0.f35084OooO0Oo;
                StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("LongLink: onMessage. { instance: ");
                sbOooO0O1.append(connection.hashCode());
                sbOooO0O1.append(", state: ");
                sbOooO0O1.append(this.f35093OooO0O0.f35090OooOO0O);
                sbOooO0O1.append(", isClosed: ");
                sbOooO0O1.append(this.f35092OooO00o);
                sbOooO0O1.append('}');
                o0O000Oo.OooO00o.OooO0O0(str2, sbOooO0O1.toString());
            }
            if (this.f35092OooO00o.get()) {
                return;
            }
            o0O000o0.OooO0O0<OUT> oooO0O1 = this.f35093OooO0O0.f35088OooO0oo;
            byte[] bytes = text.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            oooO0O1.OooO00o(bytes);
        }

        @Override // p452o0OoOoOo.o0OOo000
        public final void OooO0o(@NotNull o0OOOO0o connection, int i, @NotNull String message) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(message, "message");
            if (this.f35092OooO00o.get()) {
                return;
            }
            boolean z = i == 100;
            OooO0O0<IN, OUT> oooO0O0 = this.f35093OooO0O0;
            synchronized (oooO0O0) {
                if (oooO0O0.f35090OooOO0O == 1 && z) {
                    oooO0O0.f35090OooOO0O = 2;
                    oooO0O0.f35086OooO0o0 = connection;
                    oooO0O0.f35083OooO0OO.OooO0Oo();
                    oooO0O0.f35081OooO.start();
                }
                Unit unit = Unit.INSTANCE;
            }
            if (z) {
                o0O000Oo.OooO00o.OooO00o(this.f35093OooO0O0.f35084OooO0Oo, "LongLink: open successful!");
                OooO0O0<IN, OUT> oooO0O1 = this.f35093OooO0O0;
                Iterator<o0O000O.OooO00o.OooO0O0> it = oooO0O1.f35091OooOO0o.iterator();
                while (it.hasNext()) {
                    it.next().OooO0Oo();
                    oooO0O1.f35089OooOO0.f40318OoooO = 0;
                }
                return;
            }
            String str = this.f35093OooO0O0.f35084OooO0Oo;
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("LongLink: open failure! { instance: ");
            sbOooO0O0.append(connection.hashCode());
            sbOooO0O0.append(", state: ");
            sbOooO0O0.append(this.f35093OooO0O0.f35090OooOO0O);
            sbOooO0O0.append(", code: ");
            sbOooO0O0.append(i);
            sbOooO0O0.append(", message: ");
            sbOooO0O0.append(message);
            sbOooO0O0.append(" }");
            o0O000Oo.OooO00o.OooO00o(str, sbOooO0O0.toString());
            OooO0O0<IN, OUT> oooO0O2 = this.f35093OooO0O0;
            Iterator<o0O000O.OooO00o.OooO0O0> it2 = oooO0O2.f35091OooOO0o.iterator();
            while (it2.hasNext()) {
                it2.next().OooO0o0(new Throwable("LongLink connection failed"), i, message);
                oooO0O2.f35089OooOO0.OooO0Oo(connection, i);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p452o0OoOoOo.o0OOo000
        public final void OooO0o0(@NotNull o0OOOO0o connection, @NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            OooO0O0<IN, OUT> oooO0O0 = this.f35093OooO0O0;
            if (oooO0O0.f35090OooOO0O != 2) {
                String str = oooO0O0.f35084OooO0Oo;
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("LongLink: onMessage. { instance: ");
                sbOooO0O0.append(connection.hashCode());
                sbOooO0O0.append(", Byte Message Size: ");
                sbOooO0O0.append(bytes.length);
                sbOooO0O0.append(", isClose: ");
                sbOooO0O0.append(this.f35092OooO00o);
                sbOooO0O0.append(" }");
                o0O000Oo.OooO00o.OooO00o(str, sbOooO0O0.toString());
            } else {
                String str2 = oooO0O0.f35084OooO0Oo;
                StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("LongLink: onMessage. { instance: ");
                sbOooO0O1.append(connection.hashCode());
                sbOooO0O1.append(", state: ");
                sbOooO0O1.append(this.f35093OooO0O0.f35090OooOO0O);
                sbOooO0O1.append(", isClosed: ");
                sbOooO0O1.append(this.f35092OooO00o);
                sbOooO0O1.append('}');
                o0O000Oo.OooO00o.OooO0O0(str2, sbOooO0O1.toString());
            }
            if (this.f35092OooO00o.get()) {
                return;
            }
            this.f35093OooO0O0.f35088OooO0oo.OooO00o(bytes);
        }
    }

    /* JADX INFO: renamed from: o0O000O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0356OooO0O0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<IN, OUT> f35094Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0356OooO0O0(OooO0O0<IN, OUT> oooO0O0) {
            super(1);
            this.f35094Oooo = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            this.f35094Oooo.OooO00o(num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements o0OO0o.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<IN, OUT> f35095OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o0OO0o f35096OooO0O0;

        public OooO0OO(OooO0O0<IN, OUT> oooO0O0, o0OO0o o0oo0o2) {
            this.f35095OooO00o = oooO0O0;
            this.f35096OooO0O0 = o0oo0o2;
        }

        @Override // o0OoOoOO.o0OO0o.OooO00o
        public final void OooO00o() {
            OooO0O0<IN, OUT> oooO0O0 = this.f35095OooO00o;
            o0OOOO0o o0oooo0o2 = oooO0O0.f35086OooO0o0;
            if (o0oooo0o2 != null) {
                o0oooo0o2.OooOO0o(4000, "Pulse timeout!");
                OooO0O0<IN, OUT>.OooO00o oooO00o = oooO0O0.f35085OooO0o;
                if (oooO00o != null) {
                    oooO00o.OooO0OO(o0oooo0o2, new IllegalStateException("Pulse timeout!"), "");
                }
            }
            this.f35096OooO0O0.stop();
            o0O000Oo.OooO00o.OooO00o(this.f35095OooO00o.f35084OooO0Oo, "Pulse timeout!");
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0<IN, OUT> f35097Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooO0O0<IN, OUT> oooO0O0) {
            super(0);
            this.f35097Oooo = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f35097Oooo.f35090OooOO0O);
        }
    }

    public OooO0O0(@NotNull Context context, @NotNull OooOO0<IN, OUT> protocol, @NotNull OooO<OUT> messageHandler, @NotNull o0OOOO0o.OooO00o connectionFactory, @NotNull o reconnectionConfig, @NotNull o0OO0oO0 pulseAdapter) {
        o0OO0O0 o0ooooo1;
        o0OO0O0 o0oo0o01;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        Intrinsics.checkNotNullParameter(reconnectionConfig, "reconnectionConfig");
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        this.f35082OooO0O0 = connectionFactory;
        this.f35083OooO0OO = pulseAdapter;
        this.f35084OooO0Oo = String.valueOf(Reflection.getOrCreateKotlinClass(protocol.getClass()).getSimpleName());
        if (o0O000O.OooO0o.f35100OooO00o == null || !CoroutineScopeKt.isActive(o0O000O.OooO0o.OooO00o())) {
            o0O000O.OooO0OO oooO0OO = new o0O000O.OooO0OO(null);
            Intrinsics.checkNotNullParameter(oooO0OO, "<set-?>");
            o0O000O.OooO0o.f35100OooO00o = oooO0OO;
        }
        this.f35087OooO0oO = new OooOOO0<>(protocol, new OooO0o(this));
        o0O000o0.OooO0o receiver = new o0O000o0.OooO0o(protocol, messageHandler);
        this.f35088OooO0oo = receiver;
        OooOOO0<IN> sender = this.f35087OooO0oO;
        Intrinsics.checkNotNullParameter(pulseAdapter, "pulseAdapter");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        int i = o0OO.$EnumSwitchMapping$0[pulseAdapter.OooO0OO().ordinal()];
        if (i != 1) {
            if (i == 2) {
                o0ooooo1 = new o0OOO0(pulseAdapter, sender, receiver, protocol);
            } else if (i == 3) {
                o0oo0o01 = new o0OO0o00(pulseAdapter, sender, protocol);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                o0oo0o01 = new o0OOO0OO(pulseAdapter, receiver);
            }
            OooO0OO listener = new OooO0OO(this, o0oo0o01);
            Intrinsics.checkNotNullParameter(listener, "listener");
            o0oo0o01.f40294OooO0O0 = listener;
            this.f35081OooO = o0oo0o01;
            this.f35089OooOO0 = new o0o0000<>(context, this, reconnectionConfig, new C0356OooO0O0(this));
            this.f35088OooO0oo.run();
            this.f35091OooOO0o = new CopyOnWriteArraySet<>();
        }
        o0ooooo1 = new o0OOooO0(pulseAdapter, sender, receiver, protocol);
        o0oo0o01 = o0ooooo1;
        OooO0OO listener2 = new OooO0OO(this, o0oo0o01);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o0oo0o01.f40294OooO0O0 = listener2;
        this.f35081OooO = o0oo0o01;
        this.f35089OooOO0 = new o0o0000<>(context, this, reconnectionConfig, new C0356OooO0O0(this));
        this.f35088OooO0oo.run();
        this.f35091OooOO0o = new CopyOnWriteArraySet<>();
    }

    public final synchronized void OooO00o(int i) {
        o0OOOO0o o0oooo0o2;
        o0O000Oo.OooO00o.OooO00o(this.f35084OooO0Oo, Intrinsics.stringPlus("Request close longlink, longlink state is ", Integer.valueOf(this.f35090OooOO0O)));
        int i2 = this.f35090OooOO0O;
        if ((i2 == 2 || i2 == 1) && (o0oooo0o2 = this.f35086OooO0o0) != null) {
            o0oooo0o2.OooOO0o(1000, "Longlink closed by outside");
        }
        OooO0O0<IN, OUT>.OooO00o oooO00o = this.f35085OooO0o;
        if (oooO00o != null) {
            oooO00o.f35092OooO00o.set(true);
        }
        this.f35088OooO0oo.close();
        this.f35089OooOO0.close();
        this.f35081OooO.stop();
        this.f35090OooOO0O = 4;
        Iterator<o0O000O.OooO00o.OooO0O0> it = this.f35091OooOO0o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(i);
        }
        if (o0O000O.OooO0o.f35100OooO00o != null) {
            CoroutineScopeKt.cancel$default(o0O000O.OooO0o.OooO00o(), null, 1, null);
        }
    }

    @Override // o0O000O.OooO00o
    @Nullable
    public final o0OOOO0o OooO0O0() {
        return this.f35086OooO0o0;
    }

    @Override // o0O000O.OooO00o
    @NotNull
    public final String OooO0OO() {
        return this.f35084OooO0Oo;
    }

    public final void OooO0Oo(@NotNull o0O000O.OooO00o.OooO0O0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f35091OooOO0o.remove(callback);
    }

    @Override // o0O000O.OooO00o
    public final synchronized void open() {
        o0O000Oo.OooO00o.OooO00o(this.f35084OooO0Oo, Intrinsics.stringPlus("Request start connect, longlink state is ", Integer.valueOf(this.f35090OooOO0O)));
        int i = this.f35090OooOO0O;
        if (i == 0 || i == 3) {
            o0OOOO0o o0oooo0o2 = this.f35086OooO0o0;
            if (o0oooo0o2 != null) {
                o0oooo0o2.OooOO0o(1000, "WebSocket is not null, so cancel and close it!");
            }
            OooO0O0<IN, OUT>.OooO00o oooO00o = this.f35085OooO0o;
            if (oooO00o != null) {
                oooO00o.f35092OooO00o.set(true);
            }
            this.f35090OooOO0O = 1;
            OooO0O0<IN, OUT>.OooO00o oooO00o2 = new OooO00o(this);
            o0OOOO0o o0oooo0oOooO00o = this.f35082OooO0O0.OooO00o();
            o0oooo0oOooO00o.OooOOO0(oooO00o2);
            this.f35085OooO0o = oooO00o2;
            this.f35086OooO0o0 = o0oooo0oOooO00o;
            OooOOO0<IN> oooOOO0 = this.f35087OooO0oO;
            Objects.requireNonNull(oooOOO0);
            Intrinsics.checkNotNullParameter(o0oooo0oOooO00o, "<set-?>");
            oooOOO0.f35106OooO0OO = o0oooo0oOooO00o;
            o0oooo0oOooO00o.open();
            Iterator<T> it = this.f35091OooOO0o.iterator();
            while (it.hasNext()) {
                ((o0O000O.OooO00o.OooO0O0) it.next()).OooO0O0();
            }
        }
    }
}
