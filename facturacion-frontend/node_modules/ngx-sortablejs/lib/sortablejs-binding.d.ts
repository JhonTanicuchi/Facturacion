import { SortableData } from './sortablejs.directive';
export declare class SortablejsBinding {
    private target;
    constructor(target: SortableData);
    insert(index: number, item: any): void;
    get(index: number): any;
    remove(index: number): any;
    private get isFormArray();
}
