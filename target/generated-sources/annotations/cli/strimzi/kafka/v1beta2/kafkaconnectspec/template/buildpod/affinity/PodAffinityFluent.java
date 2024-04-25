package cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity;

import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.PreferredDuringSchedulingIgnoredDuringExecutionBuilder;
import io.fabric8.kubernetes.api.builder.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.RequiredDuringSchedulingIgnoredDuringExecutionFluent;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Iterator;
import java.util.List;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.PreferredDuringSchedulingIgnoredDuringExecution;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.RequiredDuringSchedulingIgnoredDuringExecution;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.RequiredDuringSchedulingIgnoredDuringExecutionBuilder;
import cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.PreferredDuringSchedulingIgnoredDuringExecutionFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class PodAffinityFluent<A extends PodAffinityFluent<A>> extends BaseFluent<A>{
  public PodAffinityFluent() {
  }
  
  public PodAffinityFluent(PodAffinity instance) {
    this.copyInstance(instance);
  }
  private ArrayList<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> preferredDuringSchedulingIgnoredDuringExecution;
  private ArrayList<RequiredDuringSchedulingIgnoredDuringExecutionBuilder> requiredDuringSchedulingIgnoredDuringExecution;
  private Map<String,Object> additionalProperties;
  
  protected void copyInstance(PodAffinity instance) {
    instance = (instance != null ? instance : new PodAffinity());
    if (instance != null) {
          this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());
          this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());
          this.withAdditionalProperties(instance.getAdditionalProperties());
        }
  }
  
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(int index,PreferredDuringSchedulingIgnoredDuringExecution item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder); preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(index, builder); preferredDuringSchedulingIgnoredDuringExecution.add(index, builder);}
    return (A)this;
  }
  
  public A setToPreferredDuringSchedulingIgnoredDuringExecution(int index,PreferredDuringSchedulingIgnoredDuringExecution item) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);
    if (index < 0 || index >= preferredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder); preferredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("preferredDuringSchedulingIgnoredDuringExecution").set(index, builder); preferredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
    return (A)this;
  }
  
  public A addToPreferredDuringSchedulingIgnoredDuringExecution(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.PreferredDuringSchedulingIgnoredDuringExecution... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    for (PreferredDuringSchedulingIgnoredDuringExecution item : items) {PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  
  public A addAllToPodaffinityPreferredDuringSchedulingIgnoredDuringExecution(Collection<PreferredDuringSchedulingIgnoredDuringExecution> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) {this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<PreferredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    for (PreferredDuringSchedulingIgnoredDuringExecution item : items) {PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").add(builder);this.preferredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  
  public A removeFromPreferredDuringSchedulingIgnoredDuringExecution(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.PreferredDuringSchedulingIgnoredDuringExecution... items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) return (A)this;
    for (PreferredDuringSchedulingIgnoredDuringExecution item : items) {PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder); this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPodaffinityPreferredDuringSchedulingIgnoredDuringExecution(Collection<PreferredDuringSchedulingIgnoredDuringExecution> items) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution == null) return (A)this;
    for (PreferredDuringSchedulingIgnoredDuringExecution item : items) {PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("preferredDuringSchedulingIgnoredDuringExecution").remove(builder); this.preferredDuringSchedulingIgnoredDuringExecution.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromPodaffinityPreferredDuringSchedulingIgnoredDuringExecution(Predicate<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
    if (preferredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> each = preferredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("preferredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<PreferredDuringSchedulingIgnoredDuringExecution> buildPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution != null ? build(preferredDuringSchedulingIgnoredDuringExecution) : null;
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecution buildPreferredDuringSchedulingIgnoredDuringExecution(int index) {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecution buildFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecution buildLastPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution.get(preferredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecution buildMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
      for (PreferredDuringSchedulingIgnoredDuringExecutionBuilder item : preferredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
      for (PreferredDuringSchedulingIgnoredDuringExecutionBuilder item : preferredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPreferredDuringSchedulingIgnoredDuringExecution(List<PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
      this._visitables.get("preferredDuringSchedulingIgnoredDuringExecution").clear();
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution = new ArrayList();
        for (PreferredDuringSchedulingIgnoredDuringExecution item : preferredDuringSchedulingIgnoredDuringExecution) {
          this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
        }
    } else {
      this.preferredDuringSchedulingIgnoredDuringExecution = null;
    }
    return (A) this;
  }
  
  public A withPreferredDuringSchedulingIgnoredDuringExecution(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.PreferredDuringSchedulingIgnoredDuringExecution... preferredDuringSchedulingIgnoredDuringExecution) {
    if (this.preferredDuringSchedulingIgnoredDuringExecution != null) {
        this.preferredDuringSchedulingIgnoredDuringExecution.clear();
        _visitables.remove("preferredDuringSchedulingIgnoredDuringExecution");
    }
    if (preferredDuringSchedulingIgnoredDuringExecution != null) {
      for (PreferredDuringSchedulingIgnoredDuringExecution item : preferredDuringSchedulingIgnoredDuringExecution) {
        this.addToPreferredDuringSchedulingIgnoredDuringExecution(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPreferredDuringSchedulingIgnoredDuringExecution() {
    return this.preferredDuringSchedulingIgnoredDuringExecution != null && !this.preferredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecution() {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(-1, null);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> addNewPreferredDuringSchedulingIgnoredDuringExecutionLike(PreferredDuringSchedulingIgnoredDuringExecution item) {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(-1, item);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(int index,PreferredDuringSchedulingIgnoredDuringExecution item) {
    return new PreferredDuringSchedulingIgnoredDuringExecutionNested(index, item);
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editPreferredDuringSchedulingIgnoredDuringExecution(int index) {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit preferredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstPreferredDuringSchedulingIgnoredDuringExecution() {
    if (preferredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(0, buildPreferredDuringSchedulingIgnoredDuringExecution(0));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editLastPreferredDuringSchedulingIgnoredDuringExecution() {
    int index = preferredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last preferredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public PreferredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingPreferredDuringSchedulingIgnoredDuringExecution(Predicate<PreferredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<preferredDuringSchedulingIgnoredDuringExecution.size();i++) { 
    if (predicate.test(preferredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching preferredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewPreferredDuringSchedulingIgnoredDuringExecutionLike(index, buildPreferredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public A addToRequiredDuringSchedulingIgnoredDuringExecution(int index,RequiredDuringSchedulingIgnoredDuringExecution item) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<RequiredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    RequiredDuringSchedulingIgnoredDuringExecutionBuilder builder = new RequiredDuringSchedulingIgnoredDuringExecutionBuilder(item);
    if (index < 0 || index >= requiredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder); requiredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(index, builder); requiredDuringSchedulingIgnoredDuringExecution.add(index, builder);}
    return (A)this;
  }
  
  public A setToRequiredDuringSchedulingIgnoredDuringExecution(int index,RequiredDuringSchedulingIgnoredDuringExecution item) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<RequiredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    RequiredDuringSchedulingIgnoredDuringExecutionBuilder builder = new RequiredDuringSchedulingIgnoredDuringExecutionBuilder(item);
    if (index < 0 || index >= requiredDuringSchedulingIgnoredDuringExecution.size()) { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder); requiredDuringSchedulingIgnoredDuringExecution.add(builder); } else { _visitables.get("requiredDuringSchedulingIgnoredDuringExecution").set(index, builder); requiredDuringSchedulingIgnoredDuringExecution.set(index, builder);}
    return (A)this;
  }
  
  public A addToRequiredDuringSchedulingIgnoredDuringExecution(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.RequiredDuringSchedulingIgnoredDuringExecution... items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<RequiredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    for (RequiredDuringSchedulingIgnoredDuringExecution item : items) {RequiredDuringSchedulingIgnoredDuringExecutionBuilder builder = new RequiredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  
  public A addAllToPodaffinityRequiredDuringSchedulingIgnoredDuringExecution(Collection<RequiredDuringSchedulingIgnoredDuringExecution> items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) {this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList<RequiredDuringSchedulingIgnoredDuringExecutionBuilder>();}
    for (RequiredDuringSchedulingIgnoredDuringExecution item : items) {RequiredDuringSchedulingIgnoredDuringExecutionBuilder builder = new RequiredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").add(builder);this.requiredDuringSchedulingIgnoredDuringExecution.add(builder);} return (A)this;
  }
  
  public A removeFromRequiredDuringSchedulingIgnoredDuringExecution(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.RequiredDuringSchedulingIgnoredDuringExecution... items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) return (A)this;
    for (RequiredDuringSchedulingIgnoredDuringExecution item : items) {RequiredDuringSchedulingIgnoredDuringExecutionBuilder builder = new RequiredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(builder); this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);} return (A)this;
  }
  
  public A removeAllFromPodaffinityRequiredDuringSchedulingIgnoredDuringExecution(Collection<RequiredDuringSchedulingIgnoredDuringExecution> items) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution == null) return (A)this;
    for (RequiredDuringSchedulingIgnoredDuringExecution item : items) {RequiredDuringSchedulingIgnoredDuringExecutionBuilder builder = new RequiredDuringSchedulingIgnoredDuringExecutionBuilder(item);_visitables.get("requiredDuringSchedulingIgnoredDuringExecution").remove(builder); this.requiredDuringSchedulingIgnoredDuringExecution.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromPodaffinityRequiredDuringSchedulingIgnoredDuringExecution(Predicate<RequiredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
    if (requiredDuringSchedulingIgnoredDuringExecution == null) return (A) this;
    final Iterator<RequiredDuringSchedulingIgnoredDuringExecutionBuilder> each = requiredDuringSchedulingIgnoredDuringExecution.iterator();
    final List visitables = _visitables.get("requiredDuringSchedulingIgnoredDuringExecution");
    while (each.hasNext()) {
      RequiredDuringSchedulingIgnoredDuringExecutionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<RequiredDuringSchedulingIgnoredDuringExecution> buildRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null ? build(requiredDuringSchedulingIgnoredDuringExecution) : null;
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecution buildRequiredDuringSchedulingIgnoredDuringExecution(int index) {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(index).build();
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecution buildFirstRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(0).build();
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecution buildLastRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution.get(requiredDuringSchedulingIgnoredDuringExecution.size() - 1).build();
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecution buildMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<RequiredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
      for (RequiredDuringSchedulingIgnoredDuringExecutionBuilder item : requiredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<RequiredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
      for (RequiredDuringSchedulingIgnoredDuringExecutionBuilder item : requiredDuringSchedulingIgnoredDuringExecution) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withRequiredDuringSchedulingIgnoredDuringExecution(List<RequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {
      this._visitables.get("requiredDuringSchedulingIgnoredDuringExecution").clear();
    }
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {
        this.requiredDuringSchedulingIgnoredDuringExecution = new ArrayList();
        for (RequiredDuringSchedulingIgnoredDuringExecution item : requiredDuringSchedulingIgnoredDuringExecution) {
          this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);
        }
    } else {
      this.requiredDuringSchedulingIgnoredDuringExecution = null;
    }
    return (A) this;
  }
  
  public A withRequiredDuringSchedulingIgnoredDuringExecution(cli.strimzi.kafka.v1beta2.kafkaconnectspec.template.buildpod.affinity.podaffinity.RequiredDuringSchedulingIgnoredDuringExecution... requiredDuringSchedulingIgnoredDuringExecution) {
    if (this.requiredDuringSchedulingIgnoredDuringExecution != null) {
        this.requiredDuringSchedulingIgnoredDuringExecution.clear();
        _visitables.remove("requiredDuringSchedulingIgnoredDuringExecution");
    }
    if (requiredDuringSchedulingIgnoredDuringExecution != null) {
      for (RequiredDuringSchedulingIgnoredDuringExecution item : requiredDuringSchedulingIgnoredDuringExecution) {
        this.addToRequiredDuringSchedulingIgnoredDuringExecution(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasRequiredDuringSchedulingIgnoredDuringExecution() {
    return this.requiredDuringSchedulingIgnoredDuringExecution != null && !this.requiredDuringSchedulingIgnoredDuringExecution.isEmpty();
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecution() {
    return new RequiredDuringSchedulingIgnoredDuringExecutionNested(-1, null);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> addNewRequiredDuringSchedulingIgnoredDuringExecutionLike(RequiredDuringSchedulingIgnoredDuringExecution item) {
    return new RequiredDuringSchedulingIgnoredDuringExecutionNested(-1, item);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(int index,RequiredDuringSchedulingIgnoredDuringExecution item) {
    return new RequiredDuringSchedulingIgnoredDuringExecutionNested(index, item);
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editRequiredDuringSchedulingIgnoredDuringExecution(int index) {
    if (requiredDuringSchedulingIgnoredDuringExecution.size() <= index) throw new RuntimeException("Can't edit requiredDuringSchedulingIgnoredDuringExecution. Index exceeds size.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editFirstRequiredDuringSchedulingIgnoredDuringExecution() {
    if (requiredDuringSchedulingIgnoredDuringExecution.size() == 0) throw new RuntimeException("Can't edit first requiredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(0, buildRequiredDuringSchedulingIgnoredDuringExecution(0));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editLastRequiredDuringSchedulingIgnoredDuringExecution() {
    int index = requiredDuringSchedulingIgnoredDuringExecution.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last requiredDuringSchedulingIgnoredDuringExecution. The list is empty.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public RequiredDuringSchedulingIgnoredDuringExecutionNested<A> editMatchingRequiredDuringSchedulingIgnoredDuringExecution(Predicate<RequiredDuringSchedulingIgnoredDuringExecutionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<requiredDuringSchedulingIgnoredDuringExecution.size();i++) { 
    if (predicate.test(requiredDuringSchedulingIgnoredDuringExecution.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching requiredDuringSchedulingIgnoredDuringExecution. No match found.");
    return setNewRequiredDuringSchedulingIgnoredDuringExecutionLike(index, buildRequiredDuringSchedulingIgnoredDuringExecution(index));
  }
  
  public A addToAdditionalProperties(String key,Object value) {
    if(this.additionalProperties == null && key != null && value != null) { this.additionalProperties = new LinkedHashMap(); }
    if(key != null && value != null) {this.additionalProperties.put(key, value);} return (A)this;
  }
  
  public A addToAdditionalProperties(Map<String,Object> map) {
    if(this.additionalProperties == null && map != null) { this.additionalProperties = new LinkedHashMap(); }
    if(map != null) { this.additionalProperties.putAll(map);} return (A)this;
  }
  
  public A removeFromAdditionalProperties(String key) {
    if(this.additionalProperties == null) { return (A) this; }
    if(key != null && this.additionalProperties != null) {this.additionalProperties.remove(key);} return (A)this;
  }
  
  public A removeFromAdditionalProperties(Map<String,Object> map) {
    if(this.additionalProperties == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.additionalProperties != null){this.additionalProperties.remove(key);}}} return (A)this;
  }
  
  public Map<String,Object> getAdditionalProperties() {
    return this.additionalProperties;
  }
  
  public <K,V>A withAdditionalProperties(Map<String,Object> additionalProperties) {
    if (additionalProperties == null) {
      this.additionalProperties = null;
    } else {
      this.additionalProperties = new LinkedHashMap(additionalProperties);
    }
    return (A) this;
  }
  
  public boolean hasAdditionalProperties() {
    return this.additionalProperties != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    PodAffinityFluent that = (PodAffinityFluent) o;
    if (!java.util.Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, that.preferredDuringSchedulingIgnoredDuringExecution)) return false;
    if (!java.util.Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, that.requiredDuringSchedulingIgnoredDuringExecution)) return false;
    if (!java.util.Objects.equals(additionalProperties, that.additionalProperties)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(preferredDuringSchedulingIgnoredDuringExecution,  requiredDuringSchedulingIgnoredDuringExecution,  additionalProperties,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (preferredDuringSchedulingIgnoredDuringExecution != null && !preferredDuringSchedulingIgnoredDuringExecution.isEmpty()) { sb.append("preferredDuringSchedulingIgnoredDuringExecution:"); sb.append(preferredDuringSchedulingIgnoredDuringExecution + ","); }
    if (requiredDuringSchedulingIgnoredDuringExecution != null && !requiredDuringSchedulingIgnoredDuringExecution.isEmpty()) { sb.append("requiredDuringSchedulingIgnoredDuringExecution:"); sb.append(requiredDuringSchedulingIgnoredDuringExecution + ","); }
    if (additionalProperties != null && !additionalProperties.isEmpty()) { sb.append("additionalProperties:"); sb.append(additionalProperties); }
    sb.append("}");
    return sb.toString();
  }
  public class PreferredDuringSchedulingIgnoredDuringExecutionNested<N> extends PreferredDuringSchedulingIgnoredDuringExecutionFluent<PreferredDuringSchedulingIgnoredDuringExecutionNested<N>> implements Nested<N>{
    PreferredDuringSchedulingIgnoredDuringExecutionNested(int index,PreferredDuringSchedulingIgnoredDuringExecution item) {
      this.index = index;
      this.builder = new PreferredDuringSchedulingIgnoredDuringExecutionBuilder(this, item);
    }
    PreferredDuringSchedulingIgnoredDuringExecutionBuilder builder;
    int index;
    
    public N and() {
      return (N) PodAffinityFluent.this.setToPreferredDuringSchedulingIgnoredDuringExecution(index,builder.build());
    }
    
    public N endPodaffinityPreferredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  
  }
  public class RequiredDuringSchedulingIgnoredDuringExecutionNested<N> extends RequiredDuringSchedulingIgnoredDuringExecutionFluent<RequiredDuringSchedulingIgnoredDuringExecutionNested<N>> implements Nested<N>{
    RequiredDuringSchedulingIgnoredDuringExecutionNested(int index,RequiredDuringSchedulingIgnoredDuringExecution item) {
      this.index = index;
      this.builder = new RequiredDuringSchedulingIgnoredDuringExecutionBuilder(this, item);
    }
    RequiredDuringSchedulingIgnoredDuringExecutionBuilder builder;
    int index;
    
    public N and() {
      return (N) PodAffinityFluent.this.setToRequiredDuringSchedulingIgnoredDuringExecution(index,builder.build());
    }
    
    public N endPodaffinityRequiredDuringSchedulingIgnoredDuringExecution() {
      return and();
    }
    
  
  }

}