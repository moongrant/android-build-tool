package p384o0OOooO0;

import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.opensource.svgaplayer.proto.FrameEntity;
import com.opensource.svgaplayer.proto.SpriteEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSVGAVideoSpriteEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGAVideoSpriteEntity.kt\ncom/opensource/svgaplayer/entities/SVGAVideoSpriteEntity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1549#2:62\n1620#2,3:63\n*S KotlinDebug\n*F\n+ 1 SVGAVideoSpriteEntity.kt\ncom/opensource/svgaplayer/entities/SVGAVideoSpriteEntity\n*L\n43#1:62\n43#1:63,3\n*E\n"})
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f44331OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f44332OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<o00oO0o> f44333OooO0OO;

    public oo000o(@NotNull JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.f44331OooO00o = obj.optString("imageKey");
        this.f44332OooO0O0 = obj.optString("matteKey");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = obj.optJSONArray("frames");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "optJSONObject(i)");
                    o00oO0o o00oo0o2 = new o00oO0o(jSONObjectOptJSONObject);
                    if (!o00oo0o2.f44326OooO0o0.isEmpty()) {
                        if ((((SVGAVideoShapeEntity) CollectionsKt.first((List) o00oo0o2.f44326OooO0o0)).f21275OooO00o == SVGAVideoShapeEntity.Type.keep) && arrayList.size() > 0) {
                            List<SVGAVideoShapeEntity> list = ((o00oO0o) CollectionsKt.last((List) arrayList)).f44326OooO0o0;
                            Intrinsics.checkNotNullParameter(list, "<set-?>");
                            o00oo0o2.f44326OooO0o0 = list;
                        }
                    }
                    arrayList.add(o00oo0o2);
                }
            }
        }
        this.f44333OooO0OO = CollectionsKt.toList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<o0OOooO0.o00oO0o>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public oo000o(@NotNull SpriteEntity obj) {
        ?? EmptyList;
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.f44331OooO00o = obj.imageKey;
        this.f44332OooO0O0 = obj.matteKey;
        List<FrameEntity> list = obj.frames;
        if (list != null) {
            EmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            o00oO0o o00oo0o2 = null;
            for (FrameEntity it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o00oO0o o00oo0o3 = new o00oO0o(it);
                if (!o00oo0o3.f44326OooO0o0.isEmpty()) {
                    if ((((SVGAVideoShapeEntity) CollectionsKt.first((List) o00oo0o3.f44326OooO0o0)).f21275OooO00o == SVGAVideoShapeEntity.Type.keep) && o00oo0o2 != null) {
                        List<SVGAVideoShapeEntity> list2 = o00oo0o2.f44326OooO0o0;
                        Intrinsics.checkNotNullParameter(list2, "<set-?>");
                        o00oo0o3.f44326OooO0o0 = list2;
                    }
                }
                EmptyList.add(o00oo0o3);
                o00oo0o2 = o00oo0o3;
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        this.f44333OooO0OO = EmptyList;
    }
}
