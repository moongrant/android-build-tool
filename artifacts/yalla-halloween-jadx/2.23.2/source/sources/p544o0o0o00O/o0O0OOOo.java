package p544o0o0o00O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p481o0o000O0.OooOO0;
import p481o0o000O0.OooOO0O;
import p481o0o000O0.OooOOO0;
import p481o0o000O0.OooOo00;
import p481o0o000O0.Oooo0;
import p481o0o000O0.Oooo000;
import p481o0o000O0.o000oOoO;
import p481o0o000O0.o0OoOo0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nIMMessageDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMMessageDispatcher.kt\ncom/yalla/yalla/service/im/IMMessageDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class o0O0OOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOO0O f55747OooO00o = new OooOO0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f55748OooO0O0 = new o0OoOo0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Oooo0 f55749OooO0OO = new Oooo0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOO0 f55750OooO0Oo = new OooOO0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o000oOoO f55752OooO0o0 = new o000oOoO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooOo00 f55751OooO0o = new OooOo00();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f55753OooO0oO = new OooOOO0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Oooo000 f55754OooO0oo = new Oooo000();

    @NotNull
    public final ArrayList OooO00o(@NotNull MessageIM.ReceiveReply msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.getMessagesCount() <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MessageIM.Message message : msg.getMessagesList()) {
            try {
                o0000O00.OooO0OO("MessageDispatcher", " dispatchMessage = " + message);
                if (message.getSubType() == 1) {
                    OooOO0O oooOO0O = this.f55747OooO00o;
                    Intrinsics.checkNotNull(message);
                    oooOO0O.OooO0Oo(message, false);
                } else {
                    Intrinsics.checkNotNull(message);
                    OooO0O0(message);
                }
                String mid = message.getMid();
                if (mid != null) {
                    arrayList.add(mid);
                }
            } catch (Exception e) {
                e.printStackTrace();
                o0000O00.OooO0o0("MessageDispatcher", message.toString(), e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void OooO0O0(com.app.base.protobuf.MessageIM.Message r10) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p544o0o0o00O.o0O0OOOo.OooO0O0(com.app.base.protobuf.MessageIM$Message):void");
    }
}
