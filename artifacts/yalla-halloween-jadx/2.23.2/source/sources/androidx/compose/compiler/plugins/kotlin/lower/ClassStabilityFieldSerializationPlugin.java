package androidx.compose.compiler.plugins.kotlin.lower;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.descriptors.ClassDescriptor;
import org.jetbrains.kotlin.descriptors.ClassKind;
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities;
import org.jetbrains.kotlin.metadata.ProtoBuf;
import org.jetbrains.kotlin.metadata.deserialization.Flags;
import org.jetbrains.kotlin.metadata.serialization.MutableVersionRequirementTable;
import org.jetbrains.kotlin.serialization.DescriptorSerializer;
import org.jetbrains.kotlin.serialization.DescriptorSerializerPlugin;
import org.jetbrains.kotlin.serialization.SerializerExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ClassStabilityFieldSerializationPlugin;", "Lorg/jetbrains/kotlin/serialization/DescriptorSerializerPlugin;", "()V", "hasAnnotationFlag", "", "afterClass", "", "descriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "proto", "Lorg/jetbrains/kotlin/metadata/ProtoBuf$Class$Builder;", "versionRequirementTable", "Lorg/jetbrains/kotlin/metadata/serialization/MutableVersionRequirementTable;", "childSerializer", "Lorg/jetbrains/kotlin/serialization/DescriptorSerializer;", ShareConstants.MEDIA_EXTENSION, "Lorg/jetbrains/kotlin/serialization/SerializerExtension;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ClassStabilityFieldSerializationPlugin implements DescriptorSerializerPlugin {
    private final int hasAnnotationFlag = Flags.HAS_ANNOTATIONS.toFlags(Boolean.TRUE);

    public void afterClass(@NotNull ClassDescriptor descriptor, @NotNull ProtoBuf.Class.Builder proto, @NotNull MutableVersionRequirementTable versionRequirementTable, @NotNull DescriptorSerializer childSerializer, @NotNull SerializerExtension extension) {
        if (!Intrinsics.areEqual(descriptor.getVisibility(), DescriptorVisibilities.PUBLIC) || descriptor.getKind() == ClassKind.ENUM_CLASS || descriptor.getKind() == ClassKind.ENUM_ENTRY || descriptor.getKind() == ClassKind.INTERFACE || descriptor.getKind() == ClassKind.ANNOTATION_CLASS || descriptor.isExpect() || descriptor.isInner() || descriptor.isCompanionObject() || descriptor.isInline() || (proto.getFlags() & this.hasAnnotationFlag) != 0) {
            return;
        }
        proto.setFlags(proto.getFlags() | this.hasAnnotationFlag);
    }
}
