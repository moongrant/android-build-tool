package p472o0Ooooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o0o0000.OooO00o;
import o0o0000.OooO0O0;
import o0o0000.OooO0OO;
import o0o0000.OooOO0;
import o0o0000.OooOOO;
import o0o0000.OooOOO0;
import o0o0000.OooOOOO;
import o0o0000.OooOo00;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nIMMessageDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IMMessageDispatcher.kt\ncom/yalla/yalla/service/im/IMMessageDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class oO0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f47197OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo00 f47198OooO0O0 = new OooOo00();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOOO f47199OooO0OO = new OooOOO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f47200OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooOOOO f47202OooO0o0 = new OooOOOO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooOO0 f47201OooO0o = new OooOO0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO0OO f47203OooO0oO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f47204OooO0oo = new OooOOO0();

    @NotNull
    public final ArrayList OooO00o(@NotNull MessageIM.ReceiveReply msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.getMessagesCount() <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MessageIM.Message message : msg.getMessagesList()) {
            try {
                p592o0oo00O.OooOOO0.OooO0OO("MessageDispatcher", " dispatchMessage = " + message);
                if (message.getSubType() == 1) {
                    OooO0O0 oooO0O0 = this.f47197OooO00o;
                    Intrinsics.checkNotNullExpressionValue(message, "message");
                    oooO0O0.OooO0Oo(message, false);
                } else {
                    Intrinsics.checkNotNullExpressionValue(message, "message");
                    OooO0O0(message);
                }
                String mid = message.getMid();
                if (mid != null) {
                    arrayList.add(mid);
                }
            } catch (Exception e) {
                e.printStackTrace();
                p592o0oo00O.OooOOO0.OooO0o0("MessageDispatcher", message.toString(), e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
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
        throw new UnsupportedOperationException("Method not decompiled: p472o0Ooooo0.oO0000O.OooO0O0(com.app.base.protobuf.MessageIM$Message):void");
    }
}
