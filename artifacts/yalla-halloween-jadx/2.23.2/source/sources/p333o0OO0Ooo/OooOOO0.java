package p333o0OO0Ooo;

import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.opensource.svgaplayer.proto.FrameEntity;
import com.opensource.svgaplayer.proto.SpriteEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSVGAVideoSpriteEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGAVideoSpriteEntity.kt\ncom/opensource/svgaplayer/entities/SVGAVideoSpriteEntity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1549#2:62\n1620#2,3:63\n*S KotlinDebug\n*F\n+ 1 SVGAVideoSpriteEntity.kt\ncom/opensource/svgaplayer/entities/SVGAVideoSpriteEntity\n*L\n43#1:62\n43#1:63,3\n*E\n"})
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f42433OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f42434OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<OooOOO> f42435OooO0OO;

    public OooOOO0(@NotNull JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.f42433OooO00o = obj.optString("imageKey");
        this.f42434OooO0O0 = obj.optString("matteKey");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = obj.optJSONArray("frames");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "optJSONObject(i)");
                    OooOOO oooOOO = new OooOOO(jSONObjectOptJSONObject);
                    if (!oooOOO.f42432OooO0o0.isEmpty()) {
                        if ((((SVGAVideoShapeEntity) CollectionsKt.first((List) oooOOO.f42432OooO0o0)).f20802OooO00o == SVGAVideoShapeEntity.Type.keep) && arrayList.size() > 0) {
                            List<SVGAVideoShapeEntity> list = ((OooOOO) CollectionsKt.last((List) arrayList)).f42432OooO0o0;
                            Intrinsics.checkNotNullParameter(list, "<set-?>");
                            oooOOO.f42432OooO0o0 = list;
                        }
                    }
                    arrayList.add(oooOOO);
                }
            }
        }
        this.f42435OooO0OO = CollectionsKt.toList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<o0OO0Ooo.OooOOO>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public OooOOO0(@NotNull SpriteEntity obj) {
        ?? EmptyList;
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.f42433OooO00o = obj.imageKey;
        this.f42434OooO0O0 = obj.matteKey;
        List<FrameEntity> list = obj.frames;
        if (list != null) {
            EmptyList = new ArrayList(CollectionsKt.OooO0oo(list));
            OooOOO oooOOO = null;
            for (FrameEntity it : list) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                OooOOO oooOOO2 = new OooOOO(it);
                if (!oooOOO2.f42432OooO0o0.isEmpty()) {
                    if ((((SVGAVideoShapeEntity) CollectionsKt.first((List) oooOOO2.f42432OooO0o0)).f20802OooO00o == SVGAVideoShapeEntity.Type.keep) && oooOOO != null) {
                        List<SVGAVideoShapeEntity> list2 = oooOOO.f42432OooO0o0;
                        Intrinsics.checkNotNullParameter(list2, "<set-?>");
                        oooOOO2.f42432OooO0o0 = list2;
                    }
                }
                EmptyList.add(oooOOO2);
                oooOOO = oooOOO2;
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        this.f42435OooO0OO = EmptyList;
    }
}
