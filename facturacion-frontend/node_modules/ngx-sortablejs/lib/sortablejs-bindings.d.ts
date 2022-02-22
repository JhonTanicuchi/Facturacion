import { SortablejsBinding } from './sortablejs-binding';
import { SortableData } from './sortablejs.directive';
export declare class SortablejsBindings {
    bindings: SortablejsBinding[];
    constructor(bindingTargets: SortableData[]);
    injectIntoEvery(index: number, items: any[]): void;
    getFromEvery(index: number): any[];
    extractFromEvery(index: number): any[];
    get provided(): boolean;
}
