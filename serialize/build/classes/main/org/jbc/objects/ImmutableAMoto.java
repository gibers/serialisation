package org.jbc.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import org.jbc.enums.Marques;

/**
 * Immutable implementation of {@link AMoto}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAMoto.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "AMoto"})
public final class ImmutableAMoto extends AMoto {
  private final Long id;
  private final Enum<Marques> marque;
  private final String model;
  private final int cylindre;
  private final float prix;
  private final int nbModelDispo;

  private ImmutableAMoto(ImmutableAMoto.Builder builder) {
    this.id = builder.id;
    this.marque = builder.marque;
    if (builder.model != null) {
      initShim.model(builder.model);
    }
    if (builder.cylindreIsSet()) {
      initShim.cylindre(builder.cylindre);
    }
    if (builder.prixIsSet()) {
      initShim.prix(builder.prix);
    }
    if (builder.nbModelDispoIsSet()) {
      initShim.nbModelDispo(builder.nbModelDispo);
    }
    this.model = initShim.getModel();
    this.cylindre = initShim.getCylindre();
    this.prix = initShim.getPrix();
    this.nbModelDispo = initShim.getNbModelDispo();
    this.initShim = null;
  }

  private ImmutableAMoto(
      Long id,
      Enum<Marques> marque,
      String model,
      int cylindre,
      float prix,
      int nbModelDispo) {
    this.id = id;
    this.marque = marque;
    this.model = model;
    this.cylindre = cylindre;
    this.prix = prix;
    this.nbModelDispo = nbModelDispo;
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private String model;
    private int modelBuildStage;

    String getModel() {
      if (modelBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (modelBuildStage == STAGE_UNINITIALIZED) {
        modelBuildStage = STAGE_INITIALIZING;
        this.model = Objects.requireNonNull(ImmutableAMoto.super.getModel(), "model");
        modelBuildStage = STAGE_INITIALIZED;
      }
      return this.model;
    }

    void model(String model) {
      this.model = model;
      modelBuildStage = STAGE_INITIALIZED;
    }
    private int cylindre;
    private int cylindreBuildStage;

    int getCylindre() {
      if (cylindreBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (cylindreBuildStage == STAGE_UNINITIALIZED) {
        cylindreBuildStage = STAGE_INITIALIZING;
        this.cylindre = ImmutableAMoto.super.getCylindre();
        cylindreBuildStage = STAGE_INITIALIZED;
      }
      return this.cylindre;
    }

    void cylindre(int cylindre) {
      this.cylindre = cylindre;
      cylindreBuildStage = STAGE_INITIALIZED;
    }
    private float prix;
    private int prixBuildStage;

    float getPrix() {
      if (prixBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (prixBuildStage == STAGE_UNINITIALIZED) {
        prixBuildStage = STAGE_INITIALIZING;
        this.prix = ImmutableAMoto.super.getPrix();
        prixBuildStage = STAGE_INITIALIZED;
      }
      return this.prix;
    }

    void prix(float prix) {
      this.prix = prix;
      prixBuildStage = STAGE_INITIALIZED;
    }
    private int nbModelDispo;
    private int nbModelDispoBuildStage;

    int getNbModelDispo() {
      if (nbModelDispoBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (nbModelDispoBuildStage == STAGE_UNINITIALIZED) {
        nbModelDispoBuildStage = STAGE_INITIALIZING;
        this.nbModelDispo = ImmutableAMoto.super.getNbModelDispo();
        nbModelDispoBuildStage = STAGE_INITIALIZED;
      }
      return this.nbModelDispo;
    }

    void nbModelDispo(int nbModelDispo) {
      this.nbModelDispo = nbModelDispo;
      nbModelDispoBuildStage = STAGE_INITIALIZED;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (modelBuildStage == STAGE_INITIALIZING) attributes.add("model");
      if (cylindreBuildStage == STAGE_INITIALIZING) attributes.add("cylindre");
      if (prixBuildStage == STAGE_INITIALIZING) attributes.add("prix");
      if (nbModelDispoBuildStage == STAGE_INITIALIZING) attributes.add("nbModelDispo");
      return "Cannot build AMoto, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @Override
  public Long getId() {
    return id;
  }

  /**
   * @return The value of the {@code marque} attribute
   */
  @Override
  public Enum<Marques> getMarque() {
    return marque;
  }

  /**
   * @return The value of the {@code model} attribute
   */
  @Override
  public String getModel() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getModel()
        : this.model;
  }

  /**
   * @return The value of the {@code cylindre} attribute
   */
  @Override
  public int getCylindre() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getCylindre()
        : this.cylindre;
  }

  /**
   * @return The value of the {@code prix} attribute
   */
  @Override
  public float getPrix() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getPrix()
        : this.prix;
  }

  /**
   * @return The value of the {@code nbModelDispo} attribute
   */
  @Override
  public int getNbModelDispo() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.getNbModelDispo()
        : this.nbModelDispo;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AMoto#getId() id} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAMoto withId(Long value) {
    if (this.id.equals(value)) return this;
    Long newValue = Objects.requireNonNull(value, "id");
    return new ImmutableAMoto(newValue, this.marque, this.model, this.cylindre, this.prix, this.nbModelDispo);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AMoto#getMarque() marque} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for marque
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAMoto withMarque(Enum<Marques> value) {
    if (this.marque == value) return this;
    Enum<Marques> newValue = Objects.requireNonNull(value, "marque");
    return new ImmutableAMoto(this.id, newValue, this.model, this.cylindre, this.prix, this.nbModelDispo);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AMoto#getModel() model} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for model
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAMoto withModel(String value) {
    if (this.model.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "model");
    return new ImmutableAMoto(this.id, this.marque, newValue, this.cylindre, this.prix, this.nbModelDispo);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AMoto#getCylindre() cylindre} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cylindre
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAMoto withCylindre(int value) {
    if (this.cylindre == value) return this;
    return new ImmutableAMoto(this.id, this.marque, this.model, value, this.prix, this.nbModelDispo);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AMoto#getPrix() prix} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for prix
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAMoto withPrix(float value) {
    if (Float.floatToIntBits(this.prix) == Float.floatToIntBits(value)) return this;
    return new ImmutableAMoto(this.id, this.marque, this.model, this.cylindre, value, this.nbModelDispo);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AMoto#getNbModelDispo() nbModelDispo} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nbModelDispo
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAMoto withNbModelDispo(int value) {
    if (this.nbModelDispo == value) return this;
    return new ImmutableAMoto(this.id, this.marque, this.model, this.cylindre, this.prix, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAMoto} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAMoto
        && equalTo((ImmutableAMoto) another);
  }

  private boolean equalTo(ImmutableAMoto another) {
    return id.equals(another.id)
        && marque.equals(another.marque)
        && model.equals(another.model)
        && cylindre == another.cylindre
        && Float.floatToIntBits(prix) == Float.floatToIntBits(another.prix)
        && nbModelDispo == another.nbModelDispo;
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code marque}, {@code model}, {@code cylindre}, {@code prix}, {@code nbModelDispo}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + marque.hashCode();
    h += (h << 5) + model.hashCode();
    h += (h << 5) + cylindre;
    h += (h << 5) + Float.hashCode(prix);
    h += (h << 5) + nbModelDispo;
    return h;
  }

  /**
   * Prints the immutable value {@code AMoto} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AMoto{"
        + "id=" + id
        + ", marque=" + marque
        + ", model=" + model
        + ", cylindre=" + cylindre
        + ", prix=" + prix
        + ", nbModelDispo=" + nbModelDispo
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link AMoto} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AMoto instance
   */
  public static ImmutableAMoto copyOf(AMoto instance) {
    if (instance instanceof ImmutableAMoto) {
      return (ImmutableAMoto) instance;
    }
    return ImmutableAMoto.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAMoto ImmutableAMoto}.
   * @return A new ImmutableAMoto builder
   */
  public static ImmutableAMoto.Builder builder() {
    return new ImmutableAMoto.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAMoto ImmutableAMoto}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_MARQUE = 0x2L;
    private static final long OPT_BIT_CYLINDRE = 0x1L;
    private static final long OPT_BIT_PRIX = 0x2L;
    private static final long OPT_BIT_NB_MODEL_DISPO = 0x4L;
    private long initBits = 0x3L;
    private long optBits;

    private Long id;
    private Enum<Marques> marque;
    private String model;
    private int cylindre;
    private float prix;
    private int nbModelDispo;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AMoto} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AMoto instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.getId());
      marque(instance.getMarque());
      model(instance.getModel());
      cylindre(instance.getCylindre());
      prix(instance.getPrix());
      nbModelDispo(instance.getNbModelDispo());
      return this;
    }

    /**
     * Initializes the value for the {@link AMoto#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(Long id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AMoto#getMarque() marque} attribute.
     * @param marque The value for marque 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder marque(Enum<Marques> marque) {
      this.marque = Objects.requireNonNull(marque, "marque");
      initBits &= ~INIT_BIT_MARQUE;
      return this;
    }

    /**
     * Initializes the value for the {@link AMoto#getModel() model} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AMoto#getModel() model}.</em>
     * @param model The value for model 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder model(String model) {
      this.model = Objects.requireNonNull(model, "model");
      return this;
    }

    /**
     * Initializes the value for the {@link AMoto#getCylindre() cylindre} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AMoto#getCylindre() cylindre}.</em>
     * @param cylindre The value for cylindre 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder cylindre(int cylindre) {
      this.cylindre = cylindre;
      optBits |= OPT_BIT_CYLINDRE;
      return this;
    }

    /**
     * Initializes the value for the {@link AMoto#getPrix() prix} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AMoto#getPrix() prix}.</em>
     * @param prix The value for prix 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder prix(float prix) {
      this.prix = prix;
      optBits |= OPT_BIT_PRIX;
      return this;
    }

    /**
     * Initializes the value for the {@link AMoto#getNbModelDispo() nbModelDispo} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link AMoto#getNbModelDispo() nbModelDispo}.</em>
     * @param nbModelDispo The value for nbModelDispo 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nbModelDispo(int nbModelDispo) {
      this.nbModelDispo = nbModelDispo;
      optBits |= OPT_BIT_NB_MODEL_DISPO;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAMoto ImmutableAMoto}.
     * @return An immutable instance of AMoto
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAMoto build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAMoto(this);
    }

    private boolean cylindreIsSet() {
      return (optBits & OPT_BIT_CYLINDRE) != 0;
    }

    private boolean prixIsSet() {
      return (optBits & OPT_BIT_PRIX) != 0;
    }

    private boolean nbModelDispoIsSet() {
      return (optBits & OPT_BIT_NB_MODEL_DISPO) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_MARQUE) != 0) attributes.add("marque");
      return "Cannot build AMoto, some of required attributes are not set " + attributes;
    }
  }
}
